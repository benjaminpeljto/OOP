import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.print("Type a word: ");
        words.add(reader.nextLine());
        while(true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            if(words.contains(word)){
                System.out.println("You gave the word " + word + " twice.");
                break;
            }
            else{
                words.add(word);
            }

        }
        Collections.sort(words);
        System.out.println(words);
        reader.close();
    }
}
