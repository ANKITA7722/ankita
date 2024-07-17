/*syntax:-if(condition){
    //statment;
}
else{
    ////statment
}*/
import java.util.Scanner;
class IfElse{
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
             System.out.println("enter the widrawl amount");
             int widrawlAmount = scanner.nextInt();
             int balance = 5000;
             if(widrawlAmount <= balance) {
                System.out.println("widrawl permitted");
             }
             else{
             System.out.println("widrrawl not permittes");
             }
        }
}