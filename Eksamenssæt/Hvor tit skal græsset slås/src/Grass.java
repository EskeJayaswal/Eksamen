import java.util.Scanner;

public class Grass {

    int days = 0;


    private double daysCalculator(double grassLength, double grassMax) {

        while (grassLength < grassMax) {

            grassLength += 0.8;
            days++;
        }
        return days;
    }

    public void cutGrass()
    {
        System.out.println("How long is the grass?");

        Scanner input = new Scanner(System.in);
        double grassLength = input.nextDouble();

        System.out.println("How long must the grass be before you cut it?");

        Scanner input2 = new Scanner(System.in);
        double grassMax = input2.nextDouble();

        System.out.println("There is "+daysCalculator(grassLength,grassMax)+ " days untill the grass needs to be cut");
    }
}
