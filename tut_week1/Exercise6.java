import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        System.out.println("Type the first number: ");
        Scanner reader1 = new Scanner(System.in);
        int number1 = Integer.parseInt(reader1.nextLine());

        System.out.println("Type the second number: ");
        Scanner reader2 = new Scanner(System.in);
        int number2 = Integer.parseInt(reader2.nextLine());

        if(number1 > number2){
            System.out.println("Greater number: " + number1);
        }

        else if(number1 == number2) {
            System.out.println("The numbers are equal!");
        }

        else{
            System.out.println("Greater number: " + number2);
        }
    }
}
