//for taking user input we will use library
//class scanner,witch is comming from package
//java.util
//to add this class in our program we will use import statement
//import statmnt are placed above class
//declaration
import java.util.scanner;
class UserInputOutput{
        public static void main(String[]args){
            //step3
            int number1;
            double number2;
            //step 4 scanner class object declare and initialization
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name");
            String name = scanner;
            //next()
            //nextLine();
            System.out.println("Name = "+ name);
        }
}