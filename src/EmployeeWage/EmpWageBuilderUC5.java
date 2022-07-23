package EmployeeWage;

public class EmpWageBuilderUC5 {

	public static void main(String[] args) {
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int totalSalary=0;
		int empRatePerHr=20;
		int numWorkingDays=20;
        int day;
        int empHrs;
        int RANDOM =0;
		int empCheck=(RANDOM % 3);
		for ( day=1; day<=numWorkingDays; day++ ) {  
			switch(empCheck){
			case 1:
			if (IS_FULL_TIME==empCheck)
			empHrs=8;
			
			case 2:
			if (IS_PART_TIME==empCheck)
			empHrs=4;
			
			default:
			empHrs=0;
			}
			int Salary=(empHrs*empRatePerHr);
	        System.out.println(Salary);
		
		totalSalary=(totalSalary+Salary);
		System.out.println(totalSalary);
		}}
	}

