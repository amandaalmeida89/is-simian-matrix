package com.example.isSimian;

public class IsSimianApplication {

	public static void main(String[] args) {
		String [] dna = {"CTGAGA", "CTGAGC", "TATTGT", "BGAGGG", "CCCCTA", "TCACTG"};
		Dna isDnaSimian = new Dna();
		System.out.println(isDnaSimian.isSimian(dna));
	}
}
