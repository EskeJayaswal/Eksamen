public class Regning {

    int add;
    int sub;
    double div;
    int mul;

    public void udregn(int i, int j) {
        if(i >= 1 && i <= 50 && j >= 1 && j <= 50) {
            add = i+j;
            sub = i-j;
            div = (double) i/j;
            mul = i*j;

            System.out.println("De to tal giver adderet giver: "+ add);
            System.out.println("De to tal trukket fra hinanden giver: "+sub);
            System.out.println("De to tal divideret med hinaden giver: "+div);
            System.out.println("De to tal ganget med hinanden giver: "+mul);

        } else {
            throw new IllegalArgumentException("Begge tal skal ligge i intervallet 1-50");
        }
    }
}
