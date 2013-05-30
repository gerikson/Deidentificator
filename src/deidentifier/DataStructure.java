
package deidentifier;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author gerikson
 */
public class DataStructure {

    public static int datacount = 0;
    
    // Initialize the class constructor
    public DataStructure (String row) {

            /*
             * here we need to parse the file and transform it to the 
             */
                       datacount++; 
                       String[] inputLine = row.split("\t");
                       String ref = inputLine[3];
                       String var = inputLine[4];
                       String chrom = inputLine[0];
                       String[] g = inputLine[9].split(":");
                       String genotype = g[0];
                       
                       /*
                        * something to do with the offset position 0 to 1
                        */
                       int begin = Integer.parseInt(inputLine[1]) - 1;
                       if (var.contains(",")) {
               
                            String[] variations = var.split(",");
                            for (int i=0; i<variations.length; i++) {
                                // send each variations through again
                               
                                vcfParse( chrom, begin, ref, variations[i], genotype);
                            }       
                        } else {
            vcfParse(chrom, begin, ref, var, genotype);
                       }
     
            if (datacount % 10000 == 0) {
            System.out.println(datacount);
            }

    }
    

       public void vcfParse(String chrom, int begin, String ref, String var, String genotype) {                 
                        boolean ignore = true;
                       int end = 0;

                       String varType = null;
                       
                    //is this a snp 
                    if (ref.length() == var.length() && ref.length() == 1) {
                        varType = "snp";
                      
                        end = begin + 1;
                        
                    } else if (ref.length() == var.length() && ref.length() > 1) {
                        if (ref.equals(var)) {
                            System.out.println("Reference equal to allele: " + begin);
                        } else {
                            varType = "snp";
                            int offset = 0;
                            while (ref.regionMatches(offset, var, offset, 1)) {
                                offset++;
                            }
                            ref = ref.substring(offset, offset+1);
                            var = var.substring(offset, offset+1);
                            begin = begin + offset;
                            end = begin + 1;
                            
                        }
                    }
                    
                    // is this insertion
                    else if (ref.length() < var.length() && ref.length() == 1) {
                        var = var.replaceFirst(ref, "");
                        ref = "-";
                        varType = "ins";
                        begin = begin + 1;
                        end = begin;
                       
                    }
                    else if (ref.length() < var.length() && ref.length() > 1) { 

                        var = var.replaceFirst(ref, "");
                        ref = "-";
                        varType = "ins";
                        begin = begin + 1;
                        end = begin;
                    }
                    
                    
                    //is this a deletion
                    else if (ref.length() > var.length()) {
                        int size  = ref.length() - var.length();
                        if (ref.length() > 10 && ref.regionMatches(5, "<", 0, 1)){
                            ref = ref.substring(0, 4).concat("AAA").concat(ref.substring(-5));
                            System.out.println("Crisp!!!");
                        }
                        
                        begin = begin + 1;
                        end = begin + size; 
                        ref = ref.replaceFirst(var, "");
                        var = "-";
                        varType = "del";
                    }
               
                    
                /*
                * need to parse the genotype here!!!!
                * 
                */
                   
                         try{ 
                        BufferedWriter bw = new BufferedWriter(
                        new FileWriter("parsed.txt", true));  
                       /*
                        * depending of the vcf file version, check if chromosome starts with "chr" or not
                        */ 
                       String goodLine;
                       if (chrom.startsWith("chr")) {
                          goodLine = chrom.concat("\t").concat(String.valueOf(begin)).concat("\t").
                            concat(String.valueOf(end)).concat("\t").concat(varType).concat("\t").concat(ref).concat("\t").concat(var).concat("\t").concat(genotype); 
                       }else {
                          goodLine = "chr".concat(chrom).concat("\t").concat(String.valueOf(begin)).concat("\t").
                            concat(String.valueOf(end)).concat("\t").concat(varType).concat("\t").concat(ref).concat("\t").concat(var).concat("\t").concat(genotype);
                       }
                        bw.write(goodLine);
                        bw.newLine();
                        bw.close();
                         }
                        catch(Exception e) {} 
                  
}

    

    
}
