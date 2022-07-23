package EmployeeWage;

public class EmpWageBuilderUC6 {
 public static void main(String[] args) {
	 	int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int	maxHrsInMonth=100;
		int empRatePerHr=20;
		int	numWorkingDays=20;
		int totalEmpHr=0;
		int totalWorkingDays=0;
        int empHrs;
        int RANDOM=0;
	
	for(totalWorkingDays=0; totalEmpHr <= maxHrsInMonth &&
			totalWorkingDays <= numWorkingDays; totalWorkingDays++) {
			
			 	int empCheck=(RANDOM % 3);
				switch(empCheck){
				case 1:
				
				if (IS_FULL_TIME==empCheck)
				empHrs=8;
				
				case 2:
				if (IS_PART_TIME==empCheck)
				empHrs=4;
				
				default:
				empHrs=0;	}		 	
				totalEmpHr=(totalEmpHr+empHrs );
			 	System.out.println(totalEmpHr);
			int totalSalary=(totalEmpHr*empRatePerHr);
			System.out.println(totalSalary);
}}
}
