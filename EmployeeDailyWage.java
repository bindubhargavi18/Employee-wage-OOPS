class EmployeeDailyWage
{
	private int wagehr=20,dayhrs=8,dailywage,parttimehrs=4;
	private int dayspermonth=20,wagepermonth;
	private int emp=(int)Math.floor(Math.random()*10)%3;
	public int dailyWageCal()
	{		
		switch(emp)
		{
			case 1:
			 	dailywage=wagehr*dayhrs;
				return dailywage;
			case 2:
				dailywage=wagehr*parttimehrs;
				return dailywage;
			default:
				dailywage=0;
				return dailywage;
		}
	}
	public void wageCalMonth()
	{
		dailyWageCal();
		wagepermonth=dailywage*dayspermonth;
		System.out.println("Wages per month:"+wagepermonth);
	}	
			
}