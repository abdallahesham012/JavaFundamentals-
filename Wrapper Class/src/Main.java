public class Main {
    public static void main(String[] args) {

        // Primitive Types
        int a=5;
        double b=1.9;
        char c='A';
        boolean d=true;

        // Wrapper Class Types
        // Autoboxing
        Integer a2=5;
        System.out.println(a2);
        Double b2=5.5;
        Character c2='a';
        Boolean d2=true;
        String s="Abdo";

        // >> Wrapper Classes allows to use Primitive types as objects
        // >> It used at "Collection framework & Static utility methods"

        // unboxing
        int a3=a2;
        double b3=b2;
        char c3=c2;
        boolean d3=d2;

        // Casting
        String s2=Integer.toString(548);
        String s3=Double.toString(54.21);
        String s4=Character.toString('r');
        String s5=Boolean.toString(false);

        String s6=s2+s3+s4+s5;
        System.out.println(s6);


        int a4=Integer.parseInt("123");
        double b4=Double.parseDouble("12.5");
        char c4="abdo".charAt(0);
        boolean d4=Boolean.parseBoolean("true");


        char y='@',z='a';
        System.out.println(Character.isLetter(y)); //false
        System.out.println(Character.isLetter(z)); //true
        System.out.println(Character.isUpperCase(z)); //false
        System.out.println(Character.isLowerCase(z)); //true



    }
}