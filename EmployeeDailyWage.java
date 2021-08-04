class EmployeeDailyWage
{
	private int wagehr=20,dayhrs=8,dailywage;
	private int dayspermonth=20,wagepermonth,maxhrs=100,workingdays=20;   // oops concept is encapsulation....
	private int totalhr=0,totaldays=0;									 // wrapping all data into one class
	private int emp=(int)Math.floor(Math.random()*10)%3;
	public void calWages()
	{		
		while(totalhr<maxhrs && totaldays<workingdays)
		{
			totaldays++;
			switch(emp)
			{
				case 1:
			 		dayhrs=8;
					break;
				case 2:
					dayhrs=4;;
					break;
				default:
					dayhrs=0;
			}
			totalhr=totalhr+dayhrs;
		}
		int wages = totalhr*wagehr;
		System.out.println("wage of a employee:" +wages);
	}	
}