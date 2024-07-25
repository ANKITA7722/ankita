import java.util.Scanner;
class Task{
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st no.");
        double number1 = scanner.nextInt();

        System.out.println("enter 2st no.");
        double number2 = scanner.nextInt();

        System.out.println("press1 for addition and press2 for substraction and press3 for multiplication and press4 for division");
        double  addition = scanner.nextInt();
        double substraction = scanner.nextInt();
        double  multiplication = scanner.nextInt();
        double division = scanner.nextInt();


        if(addition == 1){

            System.out.println(number1+number2);
        }
        else if( substraction == 2){

            System.out.println(number1-number2);
        }
        else if(multiplication == 3){

            System.out.println(number1*number2);
        }
        else if(division == 4){
            System.out.println(number1/number2);
        }
        else{
            System.out.println("exit");
        }
    }
}