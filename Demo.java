/*wap to ask user to enter th widrawl amount.check if the witdrawl amount is less than balance mount,
then print the msg widthddrawl amount permitted and always print tysm*/
import java.util.Scanner;
class Demo{
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
             System.out.println("enter the widrawl amount");
             int widrawlAmount = scanner.nextInt();
             int balance = 5000;
             if(widrawlAmount <= balance) {
                System.out.println("widrawl permitted");
             }
             System.out.println("thanks");
        }
}