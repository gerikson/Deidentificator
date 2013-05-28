/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deidentifier;

/**
 *
 * @author gerikson
 */
public class HelpMenu extends javax.swing.JFrame {

    /**
     * Creates new form HelpMenu
     */
    public HelpMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
       // jTextArea1.setText("Scripps Genome Adviser GUI is a visualization tool built to help researchers view and analyze SG Adviser output data.\n\nThe tool allows you to:\n\n1. Visualize big files (1GB+);\n2. View the file contents by pressing on next/previous pages at the bottom of the   page;\n3. Sort the entire file by a selected column;\n4. Simple filter - filter by any criteria any column of the file;\n5. 12 custom filter:\n    a. Coding variants – filters all possible values of the “Coding Impact” column except Synonymous values;\n    b. Coding & splice variants - all possible values of “Coding Impact” and “Splice Site Pred” (except synonymous values);\n    c. Known Disease – Causing Variants – “1” values of the ACMG-Score columns;\n    d. Clinical Known and Predicted Disease Causing Variants - all entries in the column “ACMG Score Clinical/Disease Entry/Explanation”;\n    e. Research Known and predicted Disease Causing Variants - all entries in the column “ACMG Score Research/Disease Entry/Explanation”;\n    f. Cancer Genes – all entries that are not null from either columns “COSMIC Variant”, “COSMIC Gene”, “Sanger Cancer Gene”,  “Sanger Germline Cancer Genes” or “Sanger network-informed Cancer Genes”;\n    g. Pharmacogenetic – all not null value in PharmKGB column;\n    h. Truncating Variants – all Frameshift and Nonsence variants;\n    i. Coding and Splice Variants with Frequency - all possible values of “Coding Impact” and “Splice Site Pred” (except synonymous values) that have frequency in the columns “1000Genomes”, “GC_69” and “GC_Wellderly” lower than the chosen frequency;\n    j. Non dbSNP Coding and Splice Variants with Frequency -  entries without a dbSNP ID but with all possible values in “Coding Impact” and “Splice Site Pred” columns (except synonymous values) that have frequency in the columns “1000Genomes”, “GC_69” and “GC_Wellderly” lower than the chosen frequency;\n    k. Chromosome position – choose all entries on any selected chromosome, that are located between the entered start and end position;\n6. Advance filter - filter any 3 columns with any entered filter data (AND option);\n7. Save to file – saves the current view (sort/filter) to a selected file;\n8. Comment column – insert any comment in the last column of the view, the comment will be saved if the file is saved;\n9. When you apply a filter to data it only shows the filtered data, you can further filter this data, but if you want to do a brand new filter you need to undo (Undo -> Original Data or press |<) to gain access to the original data. Also the \"|< << >> >|\" on the side of menu bar will take you through the filtered arrays;\n10. Load and compare VCF - gives you the ability to load the VCF file, the VCF file is then compared to the pipeline input file, if it comes from the same data set the Imported Genotype column is filled up with data from the VCF file;\n11. Tooltips – if you let the cursor hover above any menu item it will explain its functionality in a few words;\n\nRunning SG-ADVISER UI:\n\nOSX users: Double-click SG-ADVISER_UI_'version'.command file to run SG-Adviser UI;\nWindows users: Double-click SG-ADVISER_UI_'version'.bat file to run SG-Adviser UI;\nTerminal/console/command window users: 'cd' to the folder where the SG-ADVISER UI is located\nType java -Xmx2g -jar SG-Adviser_UI_'version'.jar\nYou may need more memory, especially if nothing seems to be happening, or you see an error in the terminal/console/command window about \"Out of Heap Space\". This can be changed by editing the *.command or *.bat file: change \"-Xmx2g\" to be something larger, like \"-Xmx8g\" (no quotes). Note that this needs to be lower than your total system memory. \n\n\nExample usage:\n1. Double click on the Sg_Adviser.jar;\n2. Go to File -> Open and select the file you want to analyze;\n3. Press on Next Page to view the file contents (to save time at loading only 500 lines are shown per view, \nyou can look at the first few pages while the entire file is being loaded in memory); \n4. Be patient till the progress bar shows that the entire file is loaded in memory before you proceed with any sorting of filtering;\n5. Sort file by a column of interest. Ex: Gene or ACMG Score;\n6. Use the custom filters by looking at Known and Predicted Disease – Causing Variants;\n7. Find out the variants in Cancer Genes from the Known and Predicted Disease Causing Variants by selecting the Cancer Genes filter;\n8. Remember that each consecutive filter is filtering the current filter data; in order to filter the entire file you have to click on Undo -> Original data or click |<;\n9. If the filter result is bigger than 1000 entries you can see the next pages by clicking on Next Page or go back by clicking on Previous Page at the bottom of the view;\n10. If you want to find only variants that are entries in PharmGKB database and drug whose metabolism is perturbed you can use the Pharmacogenetic filter;\n11. To select only entries on a specific chromosome/position choose Chromosome Position filter;\n12. To filter the variants from a single gene, in the filter bar select column “Gene”in enter the gene name. Ex: TP 53;\n13. Add comments in the comments column;\n14. Save results to file;\n15. Go back to Original Data;\n16. Use custom filter and filter by any 3 criteria;\n17. Go on genomics.scripps.edu/Adviser/Result_desc.jsp to read about the description of each column;\n18. Contact us on the forum at genomics.scripps.edu/forum/ for questions or help. Or email gerikson@scripps.edu for questions directly related to the GUI.\n\nTroubleshooting:\n\n If you are loading a bigger file (1GB+) you need to change the heap size (not forever, just for as long as the application runs, I promise it won't burn your computer) I'm working on changing the heap size at runtime but for the time being you need to type from terminal/cmd:\n      java -Xms1g -Xmx10g -jar \"path to jar file\" ; example of path to jar file was: /Users/gerikson/desktop/dist/SG-Adviser_1.2_2.jar.\n\n    If SG Adviser GUI will not start, I see error messages about \"class\" or \"loading\".\n    If you're using a Windows machine, Internet explorer may be \"helpful\" and rename the .jar file as .zip. This is bad. Either use Firefox to \"Save As\" the file (making sure it is not changing the filetype) or rename the file. To rename the file in Windows correctly, you either must be showing file extensions, or you have to use the \"ren\" command on the command prompt.\n\t\nCheck back for future functionalities:\n     Advance filter on more then 3 criteria with (“&” and “||” options and the combination on both);\n     Options menu or you can choose how many lines you wish to be displayed in a view;\n     Ability to click on a row and to see the sub-values in each column to extend in new rows;\n\nQuestions, comments, suggestions will be greatly appreciated. Please contact Galina Erikson at gerikson@scripps.edu\n\nThank you for using SG Adviser!\n");
        jTextArea1.setText(" Deidentification is a process which extracts the genotype(s) from the VCF/CGI files \n and implants clinically associated variants into the list of transmitted variants. For \n the clinically associated variants we used UCSC table named Flagged SNPs132 \n Deidentificator which accepts VCF, var and master-var files .  \n \n A deidentified file ready for SG ADVISER annotation will be *Your \n Filename*.Deidentified.tar.gz. To annotate this file you can proceed to \n genomics.scripps.edu  and upload the file for annotation. \n \n Identification strips the clinically associated variants previously implanted and \n imports back genotype(s). For identification please import the SG ADVISER \n annotated file then from the tool folder select  the *filename*.Identified file. The \n final annotated and identified file will be  final_*filename*.Identified. You can import \n this file into the SG ADVISER UI for sorting and filtering. \n\n NOTE: depending of the file(s) size both process can take a long time (up to 10 \n minutes). Please be patient and wait for a notification that deidentification/\n identification has finished and you see the output files in the tool folder. ");
        jTextArea1.setName("Help Menu"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HelpMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpMenu().setVisible(true);
            }
        });
    } 
    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   
}
