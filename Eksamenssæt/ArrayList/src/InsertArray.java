import java.util.ArrayList;

public class InsertArray {

    public boolean insertArray(ArrayList<String> al, String st)
    {
        for (int i = 0; i < al.size(); i++)
        {
            if (st.length() > 0)
            {
                if (al.get(i).equals(st))
                {
                    return false;
                }
            }
            else {
                throw new IllegalArgumentException("The entered string cannot be null");
            }
        }
        al.add(st);
        return true;
    }
}
