class EmployeeDailyWage
{
	private int fulltime=1;
	private int parttime=2,wagehr=20,dayhrs=8,dailywage,parttimehrs=4;
	private double emp=Math.floor(Math.random()*10)%3;
	public void dailyWageCal()
	{		
		if (emp==fulltime)
		{
			System.out.println("Employee is fulltime");
			dailywage=wagehr*dayhrs;
			System.out.println("Fulltime employee salary:"+dailywage);
		}
		else if(emp==parttime)
		{
			System.out.println("Employee is parttime");
			dailywage=wagehr*parttimehrs;
			System.out.println("Parttime employee salary:"+dailywage);
		}
		else
		{
			System.out.println("Employee is absent");
			System.out.println("Salary is 0");
		}
	}	
			
}