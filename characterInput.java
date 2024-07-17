//taking character input from user usng scanner
import java.util.Scanner;
class characterInput{
        public static void main(String[]args){
            System.out.println("enter any class section");
            Scanner scanner = new Scanner(System.in);
            //using charAt(int index) mathod to get the character to get the character from given index
            char section = scanner.next().charAt(0);
            System.out.println("Section = " + section);
            scanner.close();
        }
}