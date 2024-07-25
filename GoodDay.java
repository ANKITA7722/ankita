import java.util.Scanner;
class GoodDay{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       /* int time = scanner.nextInt();

        if(time >= 5 && time <=11){
            System.out.println("good morning");
        }else if(time >= 12 && time <=17){
            System.out.println("good afternoon");
        }else if(time >= 18 && time <=21){
            System.out.println("good evnining");
        }else if(time >= 22 && time <=4){
            System.out.println("good night");
        }else{
            System.out.println("bye bye");
        }*/

       int amount = scanner.nextInt("enter amount");

       if(amount >= 1 && amount <=10000){

            System.out.println("commission=" + amount*3/100);

        }else if(amount >= 10001 && amount <= 25000){

            System.out.println("commission=" + amount*8/100);

        }else if(amount >= 25001 && amount <=50000){

            System.out.println("commission=" + amount*15/100);

        }else if(amount >= 500001 && amount <= 100000){

            System.out.println("commission=" + amount*25/100);
        }else if(amount >= 100001 ){

            System.out.println("commition=" + amount*35/100);
        }else{

            System.out.println("no money");
        }
}
}