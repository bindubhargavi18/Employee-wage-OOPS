class EmployeeDailyWage
{
	private int fulltime=1,wagehr=20,dayhrs=8,dailywage;
	double emp=Math.floor(Math.random()*10)%2;
	public boolean empAttendance()
	{
		if(emp==fulltime)
			return true;
		else
			return false;
	}
	public int dailyWageCal()
	{		
		if (empAttendance())
			return wagehr*dayhrs;
		else
			return wagehr*0;
	}	
			
}