import java.util.Scanner;

class SumUsingDoWhile{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        
        do{
            System.out.println("enter an enteger");
            number = scanner.nextInt();
            if(number <= 100){
            sum = sum + number;
           }
        }while(number != 0);
        System.out.println(sum);

    }
} 