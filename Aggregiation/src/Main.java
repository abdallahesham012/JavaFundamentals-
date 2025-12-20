public class Main {
    public static void main(String[] args) {

        Book book1=new Book("Web Development",4551);
        Book book2=new Book("Artificial Intelligence",2152);
        Book book3=new Book("Computer Science",1510);

        Book []books={book1,book2,book3};
        for (Book book:books)
        {
            System.out.println(book);
        }

        System.out.println();

        //Aggregiation "Has_A"
        Library lib=new Library("Alex",452,books);
        lib.contain();

        // Library have a refrence from Book Class >> "Library Has A Books"
        // IF we remove library Class The Book class will not Affect

    }
}