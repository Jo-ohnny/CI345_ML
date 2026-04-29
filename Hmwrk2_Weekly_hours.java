package homework_java;

/*
 * Date: 4/26/26
 * Programmer : Jean oussou
 * 
 * write a program to compute the total hours of employees based on records entered by user 
 * 
 * inner steps 
 * 
 * 1) Create a method to enter hours 
 * 
 * 2) Finish the method to display all hours.
 * 
 * 3) Finish a method to compute the total hours.
 * 
 * 4) Show total hours by each emplyee 
 * */

import java.util.Scanner;

public class Hmwrk2_Weekly_hours {

	public static void main(String[] args) {
		System.out.println("Hmwrk2_Weekly_hours fisnished by Jean Oussou");
		
/*------------------------------------------------------------------------------*/
		String[] NAMES = {"Tom ", "Jane", "Mark"};
		String[] DAYS = {"MON", "TUE", "WED","THU","FRI"};
				
		// In main method: create a double type array named as hours. 
		double[][] hours = new double[NAMES.length][DAYS.length];
		
		// In main method: invoke method to enter hours amount. 
		input_hours(hours, NAMES, DAYS );
		
		
		// Invoke methods in main program. 
		display_hours(hours, NAMES, DAYS );
		
		
		System.out.println("-----------------------------------");
		System.out.println("Total hours  :  " + totalHours(hours,NAMES, DAYS ) );
		//totalHoursByEmployee(hours, NAMES, DAYS );
		THours( hours, NAMES, DAYS );
			
	} 

//--------------------------------------end of main---------------------------------------------------------
	
	// 1) Create a method to enter hours 
	public static void input_hours(double[][] hours, String[] NAMES, String[] DAYS ) { 
		Scanner input  = new Scanner(System.in);

		for(int i=0 ; i < NAMES.length; i++) {//outer loop
			System.out.println("Enter the work hours for " + NAMES[i]);
		
			for(int j =0 ; j < DAYS.length; j++) {// inner loop 
				System.out.print(DAYS[j] + " : ");
					hours[i][j] = input.nextDouble();
			}
		}
	}
	
//--------------------------------------end of main---------------------------------------------------------
	//2) Finish the method to display all hours. 
	
	
	public static void display_hours(double[][] hours, String[] NAMES, String[] DAYS ) { 
		System.out.println("\nDisplay Weekly Work Hours ");
		System.out.println("         MON   TUE   WED   THU   FRI");
		System.out.println("-------------------------------------");
		for(int i=0 ; i < NAMES.length; i++) {
			
			System.out.print(NAMES[i] + "  |  ");
			for(int j =0 ; j < DAYS.length; j++) {
				
				System.out.print(hours[i][j]  + "   ");
			}
			System.out.println();
		}
	}
	/*-000000*/
	 public static void THours(double[][] hours, String[] NAMES, String[] DAYS ) { 
    System.out.println("\nTotal Hours By Employee");
    System.out.println("----------------------------------");
	 
    for(int i=0 ; i < NAMES.length; i++) {
        double total = 0;   //to reset the hrs for each employee

        for(int j = 0; j < DAYS.length; j++) {
            total += hours[i][j];
        }

        System.out.println(NAMES[i] + "  |  " + total);
    }
}
	 /*-000000*/
//-----------------------------------------------------------------------------------------------
	
	// 3) Finish a method to compute the total hours. 
	public static double totalHours(double[][] hours, String[] NAMES, String[] DAYS ) { 
		double total = 0 ;
		for(int i=0 ; i < NAMES.length; i++) {
			for(int j =0 ; j < DAYS.length; j++) {
				total +=hours[i][j];
			}
		}
		return total;
	}
	
//-----------------------------------------------------------------------------------------------
	
	// 4) Show total hours by each emplyee
	public static void totalHoursByEmployee(double[][] hours, String[] NAMES, String[] DAYS ) { 
		System.out.println("\nTotal Hours By Employee");
		System.out.println("----------------------------------");
		double total = 0 ;
		for(int i=0 ; i < NAMES.length; i++) {
			System.out.print(NAMES[i] + "  |  ");
			for(int j =0 ; j < DAYS.length; j++) {
				total +=hours[i][j];
			}
			System.out.println(total);
		}
	}
//-----------------------------------------------------------------------------------------------
}
