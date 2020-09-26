public class RefactorCodeUC7{

	static final int present_fulltime = 1;
	static final int present_parttime = 2;
	static final int total_working_days = 20;
	static final int total_working_hours = 100;
	
	public static int checkEmpType(){
	
		return((int)(Math.random() * 10) % 3);
	}	

	public static int calcWages(){
		
		int work_hours = 0;
		int total_wages = 0, total_hours = 0, total_days = 0;	
		while (total_days < total_working_days && total_hours <= total_working_hours)
		{
			int checkEmp = checkEmpType();
			switch (checkEmp){
				case present_fulltime:
					work_hours = 8;
					break;
				case present_parttime:
					work_hours = 4;
					break;
				default:
					work_hours = 0;		
			}

			total_hours += work_hours;
			total_days++;

			System.out.println("Day: " +total_days + "  Total hours: " + total_hours);
		}

		return total_hours;

	}
	public static void main(String args[]){		
		
		int perhour_wage = 20;	
		int total_hours = calcWages();
		System.out.println("The Total Monthly wages are " + total_hours * perhour_wage);
	}
}