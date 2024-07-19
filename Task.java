import java.util.Scanner;
class Task{
    public static void main(String[]arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st no.");
        int number1 = scanner.nextInt();

        System.out.println("enter 2st no.");
        int number2 = scanner.nextInt();

        System.out.println("press1 for addition and press2 for substraction and press3 for multiplication and press4 for division");
        int  addition = scanner.nextInt();
        int substraction = scanner.nextInt();
        int  multiplication = scanner.nextInt();
        int division = scanner.nextInt();


        if(addition == 1){

            System.out.println(number1+number2);
        }
        else if( substraction == 2){

            System.out.println(number1-number2);
        }
        else if(multiplication == 3){

            System.out.println(multiplication);
        }
        else if(division == 4){
            System.out.println(division);
        }
        else{
            System.out.println("exit");
        }
    }
}