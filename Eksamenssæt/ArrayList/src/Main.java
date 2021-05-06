import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hej");
        strings.add("Med");
        strings.add("Dig");
        Collections.sort(strings);
        InsertArray in = new InsertArray();

        System.out.println(in.insertArray(strings, "grg"));
        System.out.println(strings);
    }
}
