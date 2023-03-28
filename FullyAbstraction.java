package com.Abstraction;

public abstract class FullyAbstraction {
	public void musicgeneres() {
		 System.out.println("Gener of the Music : Western");
	}
	abstract void music();
	
	public static void main(String[] args) {
		FullyAbstraction fa = new FullAbstractionChild();
		fa.music();
		fa.musicgeneres();
		
	}
}


