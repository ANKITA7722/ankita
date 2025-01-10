import java.util.Scanner;

class ConditionQuetionPractice{
    public static void main(String[]args){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("enter an integer number");
        int number = scanner.nextInt();
        if(number > 0){
            System.out.println("positive number" + number);
            
        }else{
            System.out.println("nagative number" + number);
    
        }
    }
}