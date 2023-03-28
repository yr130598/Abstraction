package com.Abstraction;

public abstract class P_A_Parent {
	public void bank_holder_name() {
		System.out.println("Account holder name");

	}
	abstract void atm_pin();// signature part 
	
	public static void main(String[] args) {
		P_A_Parent pp = new P_A_Child();
		
		pp.bank_holder_name();
		pp.atm_pin();
	}

}
