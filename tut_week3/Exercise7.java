import java.util.ArrayList;

public class Exercise7 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");

        ArrayList<Integer> len = lengths(list);
        System.out.println("The lengths of the strings are: " + len);
    }

    public static ArrayList<Integer> lengths(ArrayList<String> words){
        ArrayList<Integer> nums = new ArrayList<>();
        for(String s : words){
            nums.add(s.length());
        }
        return nums;
    }
}
