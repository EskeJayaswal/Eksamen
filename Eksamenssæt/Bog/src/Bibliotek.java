import java.util.ArrayList;

public class Bibliotek {

    Bog harryPotter = new Bog(1234,2006,"Flammernes pokal");
    Bog gameOfThrones = new Bog(1333,20010,"Ice and fire");
    Bog lordOfTheRings = new Bog(2345,1976,"Fellowship of the ring");
    Bog twillight = new Bog(2323,2010,"ju");

    ArrayList<Bog> bøger = new ArrayList<>();

    public boolean tjekBog(Bog bog) {

        bøger.add(harryPotter);
        bøger.add(gameOfThrones);
        bøger.add(lordOfTheRings);

        for (int i = 0; i < bøger.size(); i++) {
            if(bog.getISBN() == bøger.get(i).getISBN()) {
                System.out.println("Bogen er afleveret");
                return true;
            }
        }
        System.out.println("Vi har ikke din lortebog");
        return false;
    }
}
