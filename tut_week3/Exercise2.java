import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        
        System.out.println("Your name has " + (reader.nextLine().length()) + " characters.");
        reader.close();
    }
}
