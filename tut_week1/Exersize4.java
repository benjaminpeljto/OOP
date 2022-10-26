import java.util.Scanner;

public class Exersize4 {
    public static void main(String[] args) {
        System.out.println("Type a number: ");
        Scanner reader = new Scanner(System.in);
        System.out.println("Type another number: ");
        Scanner reader1 = new Scanner(System.in);

        int firstNumber = Integer.parseInt(reader.nextLine());
        int secondNumber = Integer.parseInt(reader1.nextLine());

        System.out.println("Sum of the numbers is: " + (firstNumber + secondNumber) + " !");

        reader.close();
        reader1.close();
    }
}
