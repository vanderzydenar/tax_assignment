import java.util.Scanner;

public class Taxes
{  
  public static void main ( String[] args )  
  {
    Scanner scan = new Scanner( System.in );

    double income = 0;
    double taxRate = 0;
    double remainingIncome = 0;
    double totalTaxes = 0;
    double incomePostTaxes = 0;

    System.out.println("What is your income?: ");
    income = scan.nextInt();

    //System.out.println("How old are you?: ");
    //income = scan.nextInt();

    //System.out.println("How many kids do you have?: ");
    //income = scan.nextInt();

    //income tax

    remainingIncome = income;

    if(income > 10000){
        if(income - 10000 == 0){
            remainingIncome = income - 10000;       
            taxRate = 0.0;
            totalTaxes = totalTaxes + 10000*taxRate;
        } else {
            totalTaxes = totalTaxes + income*taxRate;
        }
    } else if(remainingIncome > 10000 && remainingIncome < 25000){
        if (income - 25000 == 0){
            remainingIncome = income - 250000;       
            taxRate = 0.10;
            totalTaxes = totalTaxes + 25000*taxRate;
        } else {
            totalTaxes = totalTaxes + income*taxRate;
        }
    } else if(remainingIncome > 25000 && remainingIncome < 75000){
        if(income - 75000 == 0){
            remainingIncome = income - 75000;       
            taxRate = 0.20;
            totalTaxes = totalTaxes + 75000*taxRate;
        } else {
            totalTaxes = totalTaxes + income*taxRate;
        }
    }

    incomePostTaxes = income - totalTaxes;
    
    System.out.println(incomePostTaxes);


    

  }
}