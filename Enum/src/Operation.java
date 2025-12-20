public enum Operation {

    ADD {
        public int apply(int a, int b) { return a + b; }
    },
    SUBTRACT {
        public int apply(int a, int b) { return a - b; }
    };

    // Without it i can't apply the method apply
    public abstract int apply(int a, int b);
}
