import java.util.Scanner;

public class Exersize5 {
    public static void main(String[] args) {
        System.out.print("Type a number: ");
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());

        if(num >= 0 ){
            System.out.println("The number is positive.");
        }
        else{
            System.out.println("The number is negative");
        }
    }
}
