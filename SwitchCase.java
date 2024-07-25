
import java.util.Scanner;
class SwitchCase{
        public static void main(String[]args){
            //finding whether the given month is having 31 or 30 0r 29 days
            System.out.println("1  -----> january");
            System.out.println("2 -----> february");
            System.out.println("3 -----> march");
            System.out.println("4 -----> april");
            System.out.println("5 -----> may");
            System.out.println("6 ----->jun");
            System.out.println("7 -----> july");
            System.out.println("8 -----> augyst");
            System.out.println("9 -----> september");
            System.out.println("10 -----> octomber");
            System.out.println("11 -----> november");
            System.out.println("12 -----> desember");
            
            Scanner scanner = new Scanner(System.in);

            int month = scanner.nextInt();
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 days");
                    break; 
                case 2: 
                    System.out.println("28 or 29 days");
                    break;  
                case 4:
                case 6:
                case 9:
                case 11: 
                System.out.println("30 days");
                break;
                default:
                    System.out.println("invalide option");
            }

        }
}
