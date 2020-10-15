//program that determines whether there is a protein in a strand of DNA

public class DNA {
    String startCodon = "ATG";
    String endCodon = "TGA";

    public boolean hasStartCodon(String dna){
        return dna.indexOf(startCodon) == 0;
    }

    public boolean hasEndCodon(String dna){
        return dna.indexOf(endCodon) == dna.length() - 3;
    }

    public boolean isCorrectLength(String dna){
        return dna.length() % 3 == 0;
    }

    public String hasProtein(String dna){
        if (hasStartCodon(dna) && hasEndCodon(dna)&& isCorrectLength(dna)) {
            int end = dna.length() - 3;
            String protein = dna.substring(3, end);
            return "Protein found: " + protein;
        } else {
            return "No Protein found";
        }
    }


    public static void main(String[] args) {
        DNA proteinCheck = new DNA();

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        System.out.println(proteinCheck.hasProtein(dna1));
        System.out.println(proteinCheck.hasProtein(dna2));
        System.out.println(proteinCheck.hasProtein(dna3));

    }

}
