package EmployeeWage;

public class EmployeeWageBuilderUC2 {
	
public static void main(String[] args){
		int IS_FULL_TIME = 1;
		int empRatePerHr = 20;
		int empHrs=8;
		int Salary;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME) {
		System.out.println("Employee is Present");
		Salary = (empRatePerHr*empHrs);
		System.out.println(Salary); 
		System.out.println("Employee is Absent");
		Salary =0; 
		System.out.println(Salary);
		}
}
}