import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Integer sum = 0;

        System.out.print("Type first number: ");
        sum+=reader.nextInt();
        System.out.print("Type the second number: ");
        sum+=reader.nextInt();
        System.out.print("Type the third number: ");
        sum += reader.nextInt();

        System.out.println("Sum is: " + sum);
        reader.close();
    }
}
