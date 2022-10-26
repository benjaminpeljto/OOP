import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int rand = drawNumber();
        System.out.println(rand);
        int counter = 1;
        while(true){
            System.out.print("Guess the number: ");
            int guess = reader.nextInt();

            if(guess < rand){
                System.out.println("The number is greater, guesses made: " + counter);

            }
            else if(guess > rand){
                System.out.println("The number is lesser, guesses made: " + counter);
            }
            else if(guess == rand){
                System.out.println("Congrats!");
                break;
            }
            counter++;
        }
        reader.close();
    }

    private static int drawNumber(){
        Random rand = new Random();

        int num = rand.nextInt(101);
        return num;
    }
}
