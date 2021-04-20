package com.example.isSimian;

//time complexity O(N) N = Linha x Colunas

public class Dna {
    public boolean isSimian(String[] dna) {
        for(int i = 0; i < dna.length; i++) {
            for(int j=0; j < dna[i].length(); j++ ) {

                char currentChar = dna[i].charAt(j);

                // Horizontal
                if(dna[i].length() > j+3) {
                    if(
                            currentChar == dna[i].charAt(j+1) &&
                            currentChar == dna[i].charAt(j+2) &&
                            currentChar == dna[i].charAt(j+3)
                    ) {
                        return true;
                    }
                }

                // Vertical
                if(dna.length > i+3) {
                    if(
                            currentChar == dna[i+1].charAt(j) &&
                                    currentChar == dna[i+2].charAt(j) &&
                                    currentChar == dna[i+3].charAt(j)
                    ) {
                        return true;
                    }
                }

               // Diagonal 1
                if(j > 2 && dna.length > i + 3) {
                    if(
                            currentChar == dna[i+1].charAt(j-1) &&
                                    currentChar == dna[i+2].charAt(j-2) &&
                                    currentChar == dna[i+3].charAt(j-3)
                    ) {
                        return true;
                    }
                }

                // Diagonal 2
                if(dna[i].length() > j+3 && dna.length > i+3) {
                    if(
                            currentChar == dna[i+1].charAt(j+1) &&
                                    currentChar == dna[i+2].charAt(j+2) &&
                                    currentChar == dna[i+3].charAt(j+3)
                    ) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
