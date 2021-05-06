import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    int menuNr = 0;

    public int welcomeMenu() {
        ArrayList<String> menu = new ArrayList<>();
        menu.add("1");
        menu.add("2");
        menu.add("3");

        System.out.println("Welcome to menu, you now have the following options:" + "\n" + "1.    Beregn" + "\n" + "2.    Udskriv" + "\n" + "3.    Hjælp");

        Scanner input = new Scanner(System.in);
        String valg = input.nextLine();

        try {
            for (int i = 0; i < menu.size(); i++)
            {
                if (valg.equals(menu.get(i)))
                {
                    menuNr = i + 1;
                    System.out.println("Du har valgt " + menuNr);
                }
            }
                if (menuNr == 0 || menuNr > menu.size())
                {
                    throw new IllegalArgumentException();
                }

        } catch (IllegalArgumentException e) {
            System.out.println("Not a valid option");
        }
        return menuNr;
    }
}

