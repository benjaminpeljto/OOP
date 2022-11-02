public class Exercise1 {
    public static void main(String[] args){
        double answer = average(4,3,6,1);
        System.err.println(answer);
    }

    public static double average(int a, int b, int c, int d){
        return (a + b + c + d) / 4.0;
    }
}