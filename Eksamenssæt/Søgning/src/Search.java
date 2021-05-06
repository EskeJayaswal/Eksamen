import java.util.ArrayList;

public class Search {

    public int search(String[] stringArr, String string) {

        for (int i = 0; i < stringArr.length; i++) {
            if (string.equals(stringArr[i])) {
                System.out.println(i);
                return i;
            }
        }
        try {
            throw new IllegalArgumentException("Strengen findes ikke");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
