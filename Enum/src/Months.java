public enum Months {

    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),

    APRIL,
    MAY,
    JUNE;

    private int days;

    // Parameterized Constructor for Parameterized Objects
    Months(int days) {
        this.days = days;
    }

    // Empty Constructors for Empty Objects
    Months() {
        this.days = 30;
    }

    public int getDays() {
        return days;
    }
}
