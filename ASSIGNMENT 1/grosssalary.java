class grosssalary{
	public static void main(String args[])
	{
		double Basic = 10000.8989009;
		double TA = 5600.6778;
		double DA = 0.14 * Basic;
		double Petrolallowance = 7000.3443534546;
		double Taxdeduction = (1.76/100) * DA;
		double salary = (Basic + TA + DA + Petrolallowance - Taxdeduction);
		System.out.println("gross salary is " + salary);
	}
	
	
	
	
}