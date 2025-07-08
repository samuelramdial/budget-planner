/**
@author Ramdial, Samuel "Sam" - ITSC 1212 - 005 - von Briesen
@version 3.0
@since 09/25/2021

Project 1 Modules 1 & 2 - Budget Planner
Write a program that calculates how many hours a grader/TA at CCI needs to work to cover their living expenses.

*/
public class Budget
{
    public static void main(String[] args)

    {
        String banner = ":'######::'##:::::::'##:::'##::::'########:::'#######::'########::'####:'##::: ##:"
+ "\n" +
                        "'##... ##: ##:::::::. ##:'##::::: ##.... ##:'##.... ##: ##.... ##:. ##:: ###:: ##:"
+ "\n" +
                        " ##:::..:: ##::::::::. ####:::::: ##:::: ##: ##:::: ##: ##:::: ##:: ##:: ####: ##:"
+ "\n" +
                        ". ######:: ##:::::::::. ##::::::: ########:: ##:::: ##: ########::: ##:: ## ## ##:"
+ "\n" +
                        ":..... ##: ##:::::::::: ##::::::: ##.. ##::: ##:::: ##: ##.... ##:: ##:: ##. ####:"
+ "\n" +
                        "'##::: ##: ##:::::::::: ##::::::: ##::. ##:: ##:::: ##: ##:::: ##:: ##:: ##:. ###:"
+ "\n" +
                        ". ######:: ########:::: ##::::::: ##:::. ##:. #######:: ########::'####: ##::. ##:"
+ "\n" +
                        ":......:::........:::::..::::::::..:::::..:::.......:::........:::....::..::::..::";
                        
        String startMessage = "*******************************************START*******************************************\n";
        String adjective = "Sly";
        String animal = "Robin";
        String companyType = "Tutoring Services";
        String fullCompany = adjective + " " + animal + " " + companyType;   

        double hourlyWage = 10.0;
        double monthlyRent = 625.0;
        double monthlyInternetService = 27.0;
        double monthlyGroceryBill = 250.0; 
        double monthlyFunAllowance = 150.0;

        double totalMonthlyExpense = monthlyRent + monthlyInternetService + monthlyGroceryBill + monthlyFunAllowance ; // Adds all of the monthly expenses together. 
        double hoursForMonthlyExpense = (totalMonthlyExpense/(hourlyWage * 0.9))/4; // Total monthly expense divided by the hourly wage, taxes included. That amount divided by 4 to determine the hours per week. 
        double hoursForSavings = ((totalMonthlyExpense + 100)/(hourlyWage * 0.9))/4; //Total monthly expense with additional savings divided by the hourly wage, taxes included. That amount divided by 4 to determine the hours per week.                                                     
        String endMessage = "\n*******************************************END*******************************************";
        
        System.out.println(startMessage);
        System.out.println(fullCompany);

        System.out.println("Hourly Wage: $" + hourlyWage + "/hr");
        System.out.println("Monthly rent for a local apartment: $" + monthlyRent);
        System.out.println("Monthly internet service: $" + monthlyInternetService);
        System.out.println("Monthly grocery bill : $" + monthlyGroceryBill);
        System.out.println("Monthly 'fun' allowance: $" + monthlyFunAllowance);
        System.out.println("Total Monthly Expense: $" + totalMonthlyExpense);
        System.out.println("Hours per week the student would have to work to break even: " + hoursForMonthlyExpense);
        System.out.println("Hours per week the student would have to work to save $100 a month after paying all expenses: " + hoursForSavings);
        
        System.out.println(banner); // May need to zoom out to see
        System.out.println(endMessage);
        
    } // end main
} // end class 