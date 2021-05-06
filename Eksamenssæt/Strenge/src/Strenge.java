public class Strenge {

    public void stringene(String s1, String s2, char c1, char c2) {
        String s3 = s1 +s2;
        //System.out.println(s3);
        String newString = s3.replace(c1,c2);
        System.out.println(newString);

        if(newString.length() == 0) {
            throw new IllegalArgumentException("Du kan ikke give en tom string");
        }

    }
}
