public class Main {
    public static void main(String[] args) {

        /*
        Specifier	Meaning
        %s	        String
        %c          Char
        %d	        Integer
        %5d         width
        %-5d        left
        %f	        Float/Double
        %.2f	    2 decimal float
        %n	        New line
         */

        System.out.printf("Hello, World!\n\n");

        String name = "Ali";
        int age = 22;
        char grade = 'A';
        System.out.printf("My name is %s, I am %d years old and my grade is %c.\n\n", name, age, grade);

        double price = 123.45678;
        System.out.printf("Price: %f\n", price);   // 123.456780
        System.out.printf("Price: %.2f\n\n", price); // 2 decimal places  123.46

        System.out.printf("%10s\n", "Java");   // right aligned
        System.out.printf("%-10s\n", "Java");  // left aligned
        System.out.printf("|%10s|\n", "Java");   // right aligned
        System.out.printf("|%-10s|\n\n", "Java");  // left aligned

        System.out.printf("%5d\n", 42); // pad with spaces       42
        System.out.printf("%05d\n\n", 42); // pad with zeros  00042

        String item = "Book";
        double pricee = 49.99;
        int quantity = 3;
        System.out.printf("Item: %s | Price: %.3f | Quantity: %d\n\n",
                item, pricee, quantity);


        // Table Format
        System.out.printf("%-10s %-10s %-10s\n", "Name", "Age", "Grade");
        System.out.printf("%-10s %-10d %-10.2f\n", "Ali", 22, 88.5);
        System.out.printf("%-10s %-10d %-10.2f\n", "Omar", 21, 91.3);


    }
}