public enum WeekDays {

    // Create Constructor for all objects
    MONDAY("WorkDay"),
    TUESDAY("WorkDay"),
    WEDNESDAY("WorkDay"),
    THURSDAY("WorkDay"),
    FRIDAY("WeekDay"),
    SATURDAY("DayOff"),
    SUNDAY("DayOff");

    private String status;
    WeekDays(String status)
    {
        this.status=status;
    }

    public String getStatus() {
        return status;
    }
}
