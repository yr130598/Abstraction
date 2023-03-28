package com.Abstraction;

public class FullAbstractionChild extends FullyAbstraction {

	@Override
	void music() {
		System.out.println("Gener of the Music : Jazz");	
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
		FullAbstractionChild fa =new FullAbstractionChild();
		fa.music();
		fa.musicgenere();
		fa.musicgeneres();
	}
}
