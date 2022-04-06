public class DNA {
  // This program determines whether there is a protein in a strand of DNA
  public static void main(String[] args) {
    // DNA to check
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    // Generic string variable to set to any DNA sequence. Change to dna1, dna2, or dna 3
    String dna = dna3;

    // Check whether there is a start codon of ATG
    int start = dna.indexOf("ATG");  
    // Check whether there is a stop codon of TGA
    int stop = dna.indexOf("TGA");

    // Check whether the DNA has both stard and stop codon and the length of start and stop is dividable by 3
    if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
      // Confirms that all conditions are met
      System.out.println("Condition 1, 2, and 3 are satisfied.");
      // Put the protein into a variable and print it
      String protein = dna.substring(start, stop + 3);
      System.out.println("The protein is " + protein + ".");
    } else {
      System.out.println("No protein.");
    }
  }
}