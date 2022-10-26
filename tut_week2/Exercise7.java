public class Exercise7 {
    public static void main(String[] args) {
        printStars(119);
        printStars(4);
        printStars(1);
        printStars(0);
    }

    private static void printStars(int num){
        while(num > 0){
            System.out.print("*");
            num--;
        }
        System.out.println("");
    }
}
