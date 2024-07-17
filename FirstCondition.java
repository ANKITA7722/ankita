//wwap to accept and no. frome user and check if the no. is greater than 100,
//if greater than print the number this code will always print thank you.

import java.util.Scanner;
class FirstCondition{
        public static void main(String[]arg){
            //creating and scanner object and initializing it. also attaching the input source i.e consol input
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter any intiger");//prompting the user
            int number = scanner.nextInt();
            //condition execution
            if(number > 100){
                    System.out.println("Number =" + number);
            }
             System.out.println("thank you");
        }
}