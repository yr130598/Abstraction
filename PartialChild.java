package com.Abstraction;

public class PartialChild extends PartialAbstraction {

	@Override
	void music() {
		System.out.println("Gener of the Music : Classic");
		
	}
	@Override
	public void musicgeneres() {
		System.out.println("Gener of the Music : Rock");
		super.musicgeneres();
	}
	public void musicgenere() {
		System.out.println("Gener of the Music : Pop");

	}
	
	public static void main(String[] args) {
		PartialChild pc = new PartialChild();
		pc.music();
		pc.musicgeneres();
		pc.musicgenere();
	}

}
