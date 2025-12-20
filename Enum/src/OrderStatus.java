public enum OrderStatus {

    NEW(1),
    PROCESSING(2),
    SHIPPED(3),
    DELIVERED(4);

    private int code;

    OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
