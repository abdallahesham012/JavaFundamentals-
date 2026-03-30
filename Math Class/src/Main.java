public class Main {
    public static void main(String[] args) {

        System.out.println(Math.abs(-10));     // 10
        System.out.println(Math.max(5, 8));    // 8
        System.out.println(Math.min(5, 8));    // 5

        System.out.println();

        System.out.println(Math.pow(2, 3));    // 8.0
        System.out.println(Math.sqrt(16));     // 4.0

        System.out.println(Math.round(5.6));   // 6
        System.out.println(Math.ceil(5.2));    // 6.0
        System.out.println(Math.floor(5.9));   // 5.0

        System.out.println();

        double random = Math.random(); // between 0.0 and 1.0
        System.out.println(random);

        int number = (int)(Math.random() * 100); // 0 to 99
        System.out.println(number);

        System.out.println();

        double angle = Math.toRadians(30); // convert to radians

        System.out.println(Math.sin(angle)); // 0.5
        System.out.println(Math.cos(angle)); // ~0.866
        System.out.println(Math.tan(angle)); // ~0.577

        System.out.println();

        System.out.println(Math.log(10));     // natural log
        System.out.println(Math.log10(100));  // base 10 log
        System.out.println(Math.exp(2));      // e^2

        System.out.println();

        System.out.println(Math.PI); // 3.14159...
        System.out.println(Math.E);  // 2.71828...


        /*
        Math methods are static, so you use them like:
        Math.methodName()
        No need to create an object.
         */
    }
}