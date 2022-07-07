import java.util.Scanner;


public class criticalThinking3 {

	public static void main(String[] args) {
		
		boolean salary;
		double yearlySalary;
		double hourlyWage;
		double weeklyHours;
		double weeklySalary;
		double takeHomePay;
		double weeklyTaxWithholding;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("If salaried enter true, if hourly enter false:");
		salary = scnr.nextBoolean();
		
		if (salary == true) {
			System.out.print("Enter yearly salary: ");
			yearlySalary = scnr.nextDouble();
			weeklySalary = yearlySalary / 52;
			System.out.println(String.format("%s%.2f", "Your weekly salary is: ", weeklySalary));
		}
		else {
			System.out.print("Please enter your hourly wage: ");
			hourlyWage = scnr.nextDouble();
		
			System.out.print("Please enter your weekly hours worked: ");
			weeklyHours = scnr.nextInt();
		
			weeklySalary = hourlyWage * weeklyHours;
		
			System.out.println("Your weekly salary is: " + weeklySalary);
		}
		
		if (weeklySalary < 500) {
			weeklyTaxWithholding = weeklySalary * .10;
			System.out.println(String.format("%s%.2f", "Weekly tax withholdings based on 10% rate: " , weeklyTaxWithholding));
		}
		else if (weeklySalary < 1500) {
			weeklyTaxWithholding = weeklySalary * .15;
			System.out.println(String.format("%s%.2f", "Weekly tax withholdings based on 15% rate: " , weeklyTaxWithholding));
		}
		else if (weeklySalary < 2500) {
			weeklyTaxWithholding = weeklySalary * .20;
			System.out.println(String.format("%s%.2f", "Weekly tax withholdings based on 20% rate: " , weeklyTaxWithholding));
		}
		else {
			weeklyTaxWithholding = weeklySalary * .30;
			System.out.println(String.format("%s%.2f", "Weekly tax withholdings based on 30% rate: " , weeklyTaxWithholding));
		}
		takeHomePay = weeklySalary - weeklyTaxWithholding;
		System.out.println(String.format("%s%.2f", "Your weekly take home pay is: ", takeHomePay));
	}

}
