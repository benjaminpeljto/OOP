import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = new String();
        System.out.print("Type your original password: ");
        password = reader.nextLine();

        while(true){
            System.out.print("Type the password: ");
            String input = reader.nextLine();
            if(input.equals(password)){
                System.out.println("Right!");
                System.out.println("The secret is: I use VSCode");
                break;
            }

            else{
                System.out.println("Wrong!");
            }
        }
        reader.close();
    }
}
