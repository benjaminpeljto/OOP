import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String f = reader.nextLine();
        if(palindrome(f)){
            System.out.println("The text is palindrome!");
        }
        else{
            System.out.println("The text is not palindrome!");
        }

        reader.close();
    }

    public static boolean palindrome(String s){
        String sReverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            sReverse += s.charAt(i);
        }
        if(s.equals(sReverse)){
            return true;
        }
        else{
            return false;
        }
    }
}
