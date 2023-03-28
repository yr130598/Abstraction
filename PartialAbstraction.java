package com.Abstraction;

public abstract class PartialAbstraction {
	public void musicgeneres() {
		 System.out.println("Gener of the Music : Western");
	}
	abstract void music();
	public static void main(String[] args) {
		PartialAbstraction pa = new PartialChild();
		pa.music();
		pa.musicgeneres();
		
	}
}
