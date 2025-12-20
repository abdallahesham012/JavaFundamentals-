public class Library {

    String name;
    int number;
    Book []books;

    Library(String name,int number,Book []books)
    {
        this.name=name;
        this.number=number;
        this.books=books;
    }

    public void contain()
    {
        System.out.println(name+" "+number);
        System.out.println("Have Books");
        for (Book book:books)
            System.out.println(book);
    }
}
