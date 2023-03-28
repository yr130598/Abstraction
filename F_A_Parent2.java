package com.Abstraction;

public interface F_A_Parent2 {
	void account_no();
	void ifcs_code();
	public static void main(String[] args) {
		F_A_Parent2 fp2 = new F_A_Child();
		fp2.account_no();
		fp2.ifcs_code();

			
	}
}
