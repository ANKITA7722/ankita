import java.util.Scanner;

class DowhileDemo{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
       /* int option;
        do{
            System.out.println("enter 1 to start");
            System.out.println("enter 0 to exit");
            option = scanner.nextInt();
        }while(option != 0);*/
       /* System.out.println("Enter an integer number");
        int number = scanner.nextInt();
        int sum = 0;
        do{
            sum = sum + number % 10;
            number = number / 10;
            number--;
            //System.out.println(sum);
        }while(number != 0);
        System.out.println(sum);*/

//que2:-currect
        /* System.out.println("Enter an integer number");
        int number = scanner.nextInt();
        int sum = 0;
        do{
            if(number%2 == 0){
            System.out.println("even=" + number);
            }
            else{
               System.out.println("odd=" + number); 
            }
            number--;
        }while(number != 0);*/

//que5:-correct
int number = 1;
    for(int i=1;i<=20;i++){
        System.out.println(number*i);
    }


//que:-6
    //int number = 1;
    for(int i=1;i<=20;i++){
        if(i%2 != 0){
        System.out.println("odd"+ i);
        }
    }
 }
}