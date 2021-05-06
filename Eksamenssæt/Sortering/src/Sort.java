import java.util.Scanner;

public class Sort {

    int count;
    String temp;
    Scanner scan = new Scanner(System.in);

    public void sortStrings()
    {

        System.out.println("Enter the number of strings you wish to sort");
        count = scan.nextInt();
        String str[] = new String[count];
        System.out.println("Enter the strings");

        for (int i = 0; i < count; i++)
        {
            str[i] = scan.nextLine();
        }

        for (int i = 0; i < count; i++) 
        {
            for (int j = i+1; j < count; j++)
            {
                if (str[i].compareTo(str[j])>0)
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Strings in alphabetical order");

        for (int i = 0; i < count; i++)
        {
            System.out.println(str[i]);
        }
    }
}
