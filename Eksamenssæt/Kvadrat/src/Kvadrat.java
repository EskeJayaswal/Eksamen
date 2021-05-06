public class Kvadrat {

    public void printKvadrat(int tal, char tegn) {
        if (tal > 0 && tal < 10) {
            for (int i = 0; i < tal; i++) {
                for (int j = 1; j < tal; j++) {
                    System.out.print(tegn + " ");
                }
                System.out.println(tegn + " ");
            }
        } else  {
            throw new IllegalArgumentException("Det indtastede tal skal være mellem 0 og 9");
        }
    }
}
