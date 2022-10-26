import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
            Scanner reader = new Scanner(System.in);
            int sum = 0;
            while(true){
                int read = reader.nextInt();
                if(read == 0){
                    break;
                }
                sum += read;
                System.out.println("The sum now is: " + sum);
            }
            System.out.println("The final sum is: " + sum);
            reader.close();
    }
}
