import java.util.Scanner;

class NumberEquality{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number 1");
        int number1 = scanner.nextInt(); 
        System.out.println("enter number 2");
        int number2 = scanner.nextInt(); 
        System.out.println("enter number 3");
        int number3 = scanner.nextInt();
        //int difference = 0;
        int difference;

        if(number1 == number2 && number1 != number3){
            if(number3 < number1){
                difference = number1 - number3;
                number3 = number3 + difference;
            }else{
                difference = number3 - number1;
                number3 = number3 - difference;
            }
            }else if(number1 == number3 && number1 != number2 ){
                if(number2 <number1){
                    difference = number1 - number2;
                    number2 = number2 + difference;
                }else{
                    difference = number2 - number1;
                    number2 = number2 - difference;
                }
                }else if(number2 == number3 && number2 != number1){
                    if(number1 < number2){
                        difference = number2 - number1;
                        number1 += difference;
                    }else{
                        System.out.println("invalid input");
                    }
                    System.out.println("Number3=" + number3);
                    System.out.println("Number2=" + number2);
                    System.out.println("Number1=" + number1);
                }
            }
        } 
    
