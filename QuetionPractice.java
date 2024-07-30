//wap to 
import java.util.Scanner;
class QuetionPractice{
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
       /* System.out.println("enter circumfrance of cercle");
        int circumfrance  = scanner.nextInt();
        double result = circumfrance /(2*3.14); 
        System.out.println("redios of circul=" + result) ;*/

        /*int maximum = 0;
        int userInput;
        do{
            System.out.println("enter an integer ,enter 0 to stop");
            userInput = scanner.nextInt();
            if(userInput > maximum){
                maximum = userInput;
               
            }

        }while(userInput != 0);
        System.out.printing("maximum value =" + maximum);
    }*/
   //que:-4
   /*int number1 =scanner.nextInt();
    int number2 =scanner.nextInt();
     int number3 =scanner.nextInt();
     if(number1%9==0 && number2%9==0 && number3%9==0){
                System.out.println("all nubmers are divisible by 9");
            }else{
        System.out.println("numbers not divisble by 9");
     } */

    //que:-5
   /* System.out.println("Enter an integer number");
      int number = scanner.nextInt();
      if(number != 0){
        if(number > 0){
            System.out.println("number is positive");
        }else{
            System.out.println("number is negative");
        }
      }*/

     //que:-6
     /*System.out.println("Enter an integer number");
      int number = scanner.nextInt();
      if(number != 0){
        if(number%2 == 0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
      }*/

     //que:-8

     // int number1 = scanner.nextInt();
      //int number2 = scanner.nextInt();
      System.out.println("Enter an widthdrawl amount");
      int withdrawalBalance = scanner.nextInt();
      int curuntbalance = 500;
      if(withdrawalBalance > curuntbalance){
        System.out.prinln("insufficient funds");
        if(withdrawalBalance < curuntbalance){
            if(curuntbalance <= 500){
            System.out.println(curuntbalance + 50);
            }else{
            System.out.prinln(curuntbalance);
                }
        }
      }
}
}