//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int x=random.nextInt(); // boundaries of integer
        int y=random.nextInt(1,7); // [1, 7[  from 1 to 6

        System.out.println("x = " + x+"\ny = "+y);

        double a = random.nextDouble();
        double b = random.nextDouble(1.5,10);

        System.out.println("\na = " + a+"\nb = "+b);

        boolean z = random.nextBoolean();

        System.out.println("\nz = "+z);

    }
}