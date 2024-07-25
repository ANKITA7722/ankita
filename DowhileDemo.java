import java.util.Scanner;

class DowhileDemo{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int option;
        do{
            System.out.println("enter 1 to start");
            System.out.println("enter 0 to exit");
            option = scanner.nextInt();
        }while(option != 0);
    }
}