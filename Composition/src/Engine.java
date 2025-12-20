public class Engine {

    String type;

    Engine(String type)
    {
        this.type=type;
    }

//    public String toString()
//    {
//        return type;
//    }

    public void print()
    {
        System.out.println("I'm Engine of type "+this.type);
    }
}
