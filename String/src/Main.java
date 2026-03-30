public class Main {
    public static void main(String[] args) {

        String text = "Hello";
        System.out.println(text.length()); // 5

        System.out.println();

        text = "Java";
        System.out.println(text.toUpperCase()); // JAVA
        System.out.println(text.toLowerCase()); // java

        System.out.println();

        text = "Hello";
        System.out.println(text.charAt(1)); // e
        System.out.println(text.charAt(4)); // o

        System.out.println();

        System.out.println(text.indexOf('l')); // 2
        System.out.println(text.indexOf('a')); // -1

        System.out.println();

        text = "I love Java";
        System.out.println(text.contains("Java")); // true
        System.out.println(text.contains("java")); // false
        System.out.println(text.contains("ve Ja")); // true

        System.out.println();

        String a = "java";
        String b = "JAVA";
        System.out.println(a.equals(b));           // false
        System.out.println(a.equalsIgnoreCase(b)); // true

        System.out.println();

        text = "I love Java";
        System.out.println(text.replace("Java", "Python"));
        System.out.println(text.replace("I", "Python"));
        System.out.println(text.replace("lovee", "Python"));

        System.out.println();

        text = "   Hello   ";
        System.out.println(text.trim()); // Remove spaces "Hello"

        System.out.println();

        text = "";
        System.out.println(text.isEmpty());
        text = "Dodo";
        System.out.println(text.isEmpty());
        text = " ";
        System.out.println(text.isEmpty());

        System.out.println();

        // *** SubString ***

        text = "Hello World";
        System.out.println(text.substring(6)); // World
        System.out.println(text.substring(0, 5)); // [0, 5[  >> Hello
        /*
        start index included
        end index excluded
         */
        // Edge case (empty string)
        System.out.println(text.substring(4,4)); // ""
        //Full string
        System.out.println(text.substring(0));

        System.out.println();

        String email = "abdallah@gmail.com";
        int index = email.indexOf('@');
        String username = email.substring(0, index);
        String domain = email.substring(index + 1);
        System.out.println(username); // user
        System.out.println(domain);

        System.out.println();


        // Split >> Convert String to array of Strings
        text = "Java,Python,C++";
        String[] langs = text.split(",");
        for (String lang : langs)
            System.out.println(lang);




    }
}