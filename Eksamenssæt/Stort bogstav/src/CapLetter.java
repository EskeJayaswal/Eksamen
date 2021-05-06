import java.util.Scanner;

public class CapLetter
{
    int counter = 0;
    Scanner scan = new Scanner(System.in);

    public void capitalLetter() {

        System.out.println("Enter som strings");

        while(true)
        {

            String str = scan.nextLine();
            if (str.equalsIgnoreCase(""))
                break;

            if (Character.isUpperCase(str.charAt(0)))
            {
                counter++;
            }
        }
        System.out.println("There is "+ counter + " string[s] that begin with upper case");
    }
}
