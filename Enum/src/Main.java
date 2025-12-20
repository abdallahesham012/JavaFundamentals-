import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Enums = (Enumerations) A special kind of class that
        //          represents a fixed set of constants.
        //          They improve code readability and are easy to maintain.
        //          More efficient with switches when comparing Strings.

        Numbers num=Numbers.ONE;
        switch (num)
        {
            case ONE :
                System.out.println(1);
                break;
            case TWO:
                System.out.println(2);
                break;
            case THREE:
                System.out.println(3);
                break;
        }

        System.out.println();
        /// //////////////////////////////////////////////////////////////////////////////////////////////////////////

        WeekDays day=WeekDays.MONDAY;
        System.out.println(day);
        System.out.println(day.getStatus());

        System.out.println();
        /// ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        // Months with Parameterized Constructor
        System.out.println(Months.JANUARY+" "+Months.JANUARY.getDays()); // 31
        System.out.println(Months.FEBRUARY+" "+Months.FEBRUARY.getDays()); // 28
        System.out.println(Months.MARCH+" "+Months.MARCH.getDays());    // 31

        // Months with Default Constructor
        System.out.println(Months.APRIL+" "+Months.APRIL.getDays());    // 30
        System.out.println(Months.MAY+" "+Months.MAY.getDays());      // 30
        System.out.println(Months.JUNE+" "+Months.JUNE.getDays());     // 30

        System.out.println();

        // Iterate with foreach loop
        for(Months month:Months.values())
        {
            System.out.println(month);
        }

        System.out.println();
        System.out.println(Arrays.toString(Months.values()));

        System.out.println();
        Months m=Months.valueOf("MAY");
        System.out.println(m);

        System.out.println();
        for(Months month:Months.values())
        {
            // The idx of month
            System.out.println(month+" "+month.ordinal());
        }

        System.out.println();
        /// ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println(Operation.ADD.apply(5,3));
        System.out.println(Operation.SUBTRACT.apply(8,2));
        System.out.println();
        /// ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        OrderStatus status = OrderStatus.SHIPPED;
        System.out.println(status.getCode()); // 3
    }
}