//Avid Dev - July 8, 2019

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


public class Apprentice {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("d");
		System.out.print("hi");
		//Input Creation
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Formatting for output
		DecimalFormat cf = new DecimalFormat("$###,###,##0.00"); //Currency Format
		DecimalFormat nz = new DecimalFormat("###,###,###.######"); //No Zero (so 543 isn't 543.0, as is default for double)
		
		//Get number of departments - No Error Handling
		System.out.print("[INFO] Please enter the number of departments that you have: ");
		int departments = Integer.valueOf(in.readLine()).intValue();
		
		//Total values
		double money = 0;
		String allIndividual = ""; //Holds text for every individual department
		
		//Departmental Calculations
		for (int i = 0; i < departments; i ++) {
			//Input
			System.out.print("\n[INFO - " + (i+1) + "] Please enter the name of the department: ");
			String departmentName = in.readLine();
			System.out.print("[INFO - " + (i+1) + "] Please enter the number of employees in the department: ");
			double employees = Double.valueOf(in.readLine()).doubleValue();
			System.out.print("[INFO - " + (i+1) + "] Please enter the cost per employee in the department: ");
			double costPerEmployee = Double.valueOf(in.readLine()).doubleValue();
			System.out.print("[INFO - " + (i+1) + "] Please enter the amount of sales for the department: ");
			double sales = Double.valueOf(in.readLine()).doubleValue();
			
			//Individual Department Calculations
			double costToRun = employees*costPerEmployee;
			double profit = sales-costToRun;
			
			//Global Calculations
			money += profit;
			
			//Output - Added to allIndividual
			allIndividual += ("\n["+departmentName+"]");
			allIndividual += "\n- Employees: " + nz.format(employees);
			allIndividual += "\n- Cost Per Employee: " + cf.format(costPerEmployee);
			allIndividual += "\n- Sales: " + cf.format(sales);
			allIndividual += "\n- Cost to Operate: " + cf.format(costToRun);
			allIndividual += "\n- Profit: " + cf.format(profit)+ "\n";
		} //End of for-loop
		
		//Total for all Departments
		System.out.println(allIndividual + "\n[TOTAL]");
		if (money > 0) {
			System.out.println("You didn't go bankrupt! You made " + cf.format(money));
		} else {
			System.out.println("You went bankrupt! You have " + cf.format(money));
		}
	} //End of main
} //End of class
