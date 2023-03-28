package com.Abstraction;

public class P_A_Child extends P_A_Parent{

	@Override
	void atm_pin() {
		System.out.println("ATM Pin : 1234");
	}
	@Override
	public void bank_holder_name() {
		super.bank_holder_name();
		System.out.println("Account name");
	}
	
	public static void main(String[] args) {
		P_A_Child pc = new P_A_Child();
		pc.atm_pin();
		pc.bank_holder_name();
	}


	

}
