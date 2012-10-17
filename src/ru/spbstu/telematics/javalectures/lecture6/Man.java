package ru.spbstu.telematics.javalectures.lecture6;

public class Man implements Comparable<Man> {

	private Long dna = 0L;
	
	@Override
	public int compareTo(Man o) {
		return dna.compareTo(o.dna);
	}
	
	public void printDNA(){
		System.out.println("dna" + dna);
	}

}
