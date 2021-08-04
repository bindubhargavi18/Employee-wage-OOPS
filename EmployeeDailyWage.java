class EmployeeDailyWage
{
	private int wagehr=20,dayhrs=8,dailywage,parttimehrs=4;
	private int emp=(int)Math.floor(Math.random()*10)%3;
	public void dailyWageCal()
	{		
		switch(emp)
		{
			case 1:
			 	dailywage=wagehr*dayhrs;
				System.out.println("employee daily wage:" +dailywage);
				break;
			case 2:
				dailywage=wagehr*parttimehrs;
				System.out.println("part time empoyee wage:" +dailywage);
				break;
			default:
				System.out.println("employee is absent and salary will be 0");
		}
	}	
			
}