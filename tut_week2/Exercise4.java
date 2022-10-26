import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int first = reader.nextInt();

        System.out.print("Second: ");
        int second = reader.nextInt();
        System.out.println("");

        if(first <= second){
            while(first < second){
                System.out.println(first);
                first++;
            }
        }
        reader.close();
    }
}
