package com.Abstraction;

public interface F_A_Parent1 {
	void employee_id();
	void designation();
	public static void main(String[] args) {
		F_A_Parent1 fp1 = new F_A_Child();
		fp1.designation();
		fp1.employee_id();		
			
	}
}
