//wap to accept marks off tree subjects frome the user.best on the condition print the gread score.
//gred A if the % above 90
// b-% above 80
// c-%above 70
//d-60
//for all of other  persentage not allocated
//programing instutio-use proper class name,use proper and meaning full name frome variable,use proper spacing 
import java.util.Scanner;
class Test{
        public static void main(String[]args){
           Scanner scanner = new Scanner(System.in);
            System.out.println("enter  math marks");
            double mathmarks = scanner.nextInt(); // not following naming convention, wrong data type

            System.out.println("enter  scince marks");
            double scincemarks = scanner.nextInt(); //non meaningful name

            System.out.println("enter  bio marks");
            double biomarks = scanner.nextInt();

            double total = (mathmarks+scincemarks+biomarks/3.0); // wrong syntax for calculation, as well as int /int
            // float must be avoided, until not mentioned
             if(total < 33){

                System.out.println("dont calculate marks");
                
             }else if( total >= 90){// improper spacing

                System.out.println("gred A");

            }else if(total >= 80){

                System.out.println("gred B");

            }else if(total >= 70){

                System.out.println("gred C");

            }else if(total >= 60 && total <= 33){

                System.out.println("gred D");

            }else{

                System.out.println("fail");
            }
            
        }
}
