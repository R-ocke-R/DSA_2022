import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> i= new ArrayList<>();
        i.add(0, 2);
        i.add(1, 3);
        i.add(0, 1);
        System.out.println(i.toString());

    }
}
