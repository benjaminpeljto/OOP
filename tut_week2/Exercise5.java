import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = reader.nextInt();
        int sum = 0;
        while(num >= 0){
            sum += Math.pow(2, num);
            num--;
        }

        System.out.println("The result is: " + sum);
        reader.close();
    }
}
