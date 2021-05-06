import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Case
{
    String temp;

    ArrayList<String> newSentence = new ArrayList<>();

    private boolean isUpperCase(String str)
    {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++)
        {
            if (!Character.isUpperCase(charArray[i]))
                return false;
        }
        return true;
    }

    public void caseSwitch(String str)
    {
        String[] split = str.split(" ");

        for (int i = 0; i < split.length; i++)
        {
            if (!isUpperCase(split[i]) && split[i].length() <= 3)
            {
                temp = split[i].toLowerCase();
                newSentence.add(temp);

            }
            else if (!isUpperCase(split[i]) && split[i].length() > 3)
            {
                temp = split[i].toLowerCase();
                temp = temp.substring(0,1).toUpperCase() + temp.substring(1);
                newSentence.add(temp);
            }
            else
            {
                newSentence.add(split[i]);
            }
        }
        System.out.println(newSentence);
    }
}
