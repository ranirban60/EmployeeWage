package EmployeeWage;

public class EmpWageBuilderUC4 {
	
	public static void main(String[] args) {
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int empRatePerHr = 20;
		int empHrs;
		int RANDOM =0;
		int empCheck=(RANDOM % 3);
		switch(empCheck){
		case 1:
		
		if (IS_FULL_TIME==empCheck)
		empHrs=8;
		
		case 2:
		if (IS_PART_TIME==empCheck)
		empHrs=4;
		
		default:
		empHrs=0;
        
		int Salary=(empHrs*empRatePerHr);
        System.out.println(Salary);
	}

}

		
	}
