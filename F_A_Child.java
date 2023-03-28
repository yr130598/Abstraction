package com.Abstraction;
public class F_A_Child implements F_A_Parent2,F_A_Parent1 {
	@Override
	public void employee_id() {
		System.out.println("id : 1234");		
	}
	@Override
	public void designation() {
		System.out.println("designation: software engineer");		
	}
	@Override
	public void account_no() {
	System.out.println("acc no : 1234567890123456");		
	}
	@Override
	public void ifcs_code() {
		System.out.println("ifsc : hdfc1234465");	
	}
	public static void main(String[] args) {
		F_A_Child fc = new F_A_Child();
		fc.account_no();
		fc.designation();
		fc.employee_id();
		fc.ifcs_code();
	}
	

}
