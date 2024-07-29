//wap to 
import java.util.Scanner;
class QuetionPractice{
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
       /* System.out.println("enter circumfrance of cercle");
        int circumfrance  = scanner.nextInt();
        double result = circumfrance /(2*3.14); 
        System.out.println("redios of circul=" + result) ;*/

        int maximum = 0;
        int userInput;
        do{
            System.out.println("enter an integer ,enter 0 to stop");
            userInput = scanner.nextInt();
            if(userInput > maximum){
                maximum = userInput;
               
            }

        }while(userInput != 0);
        System.out.printing("maximum value =" + maximum);
    }
}