public class Gene {
    private String dna;
    private int geneCount;

    Gene(String dna) {
        this.dna = dna;
        this.geneCount = dna.length() % 3;
    }

    static int countNucleotides(String g, char nucleotide) {
        int index = 0;
        for (int i = 0; i < g.length(); i++) {
            if (g.charAt(i) == nucleotide) {
                index++;
            }

        }
        return index;
    }


    static int findStopCodon(String genome, int start) {

        if (genome.length() % 3 != 0) {return -1;}
   
        for (int i = start; i < genome.length(); i += 3) {
            String codon = genome.substring(i, i+3);
            if (codon.equals("TAA") || codon.equals("TAG") || codon.equals("TGA")) {
                return i;
            }
        }
        return -1;
    }

    static String findGenes(String dna, int startInt) {
        return dna.substring(startInt);
    }


    static boolean potentialGene(String dna) {
        // use findstopCodon, start with ATG, length divisible by 3


        if (dna.length() % 3 == 0 && dna.substring(0,3).equals("ATG") && findStopCodon(dna, 3) != -1) {
            return true;
        }  

        return false;
        

    }


    public static void main(String[] args) {
        String gene_string = "ATGCATAGCGCATAG";
        Gene gene = new Gene("ATGCATAGCGCATAG");
        System.out.println(countNucleotides(gene_string, 'T'));
        System.out.println(findStopCodon(gene_string, 3));
        System.out.println(potentialGene(gene_string));
    }

}
