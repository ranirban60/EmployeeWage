package EmployeeWage;

public class EmpWageBuilderUC3 {
 public static void main(String[] args) {
	 int IS_FULL_TIME=1;
	 int IS_PART_TIME=2;
	 int empRatePerHr=20;
	 int empHrs;
	 int RANDOM =1;
	int randomCheck =(RANDOM % 3);
   
	 if( IS_FULL_TIME == randomCheck) { 
	 	empHrs=8;
	 	int Salary = (empHrs*empRatePerHr);
		 System.out.println(Salary);
		 }
	 else if ( IS_PART_TIME == randomCheck) {
	 	empHrs=4;
	 	int Salary = (empHrs*empRatePerHr);
		 System.out.println(Salary);
		 }
	else {
		empHrs=0;
	 	int Salary = (empHrs*empRatePerHr);
		 System.out.println(Salary);
		 }
	 
}
}


