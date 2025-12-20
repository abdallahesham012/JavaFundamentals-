# Java Learning Projects

A comprehensive collection of Java learning modules covering fundamental OOP concepts, data structures, and file operations. This repository contains practical examples and implementations of core Java features suitable for beginners and intermediate learners.

---

## Project Structure

### 1. **Aggregation**
**Location:** `Aggregation/src/`

Demonstrates the "Has-A" relationship in object-oriented programming.

**Classes:**
- `Book.java` - Represents a book with title and ISBN
- `Library.java` - Represents a library that contains multiple books
- `Main.java` - Example demonstrating aggregation

**Key Concepts:**
- Loose coupling between objects
- A Library "has a" collection of Books
- If the Library is removed, Books still exist independently
- Aggregation represents a "whole-part" relationship

**Example:**
```java
Library lib = new Library("Alex", 452, books);
lib.contain();  // Library contains books but doesn't own them
```

---

### 2. **Composition**
**Location:** `Composition/src/`

Demonstrates the "Part-Of" relationship where child objects cannot exist independently.

**Classes:**
- `Car.java` - Represents a car with model, year, and engine
- `Engine.java` - Represents a car engine
- `Main.java` - Example demonstrating composition

**Key Concepts:**
- Tight coupling between objects
- A Car "has" an Engine that is part of it
- If the Car is destroyed, the Engine ceases to exist
- Child objects depend on their parent

**Example:**
```java
Car car1 = new Car("BMW", 2025, "VME");
System.out.println(car1.engine.type);  // Engine is part of car
```

---

### 3. **ArrayList**
**Location:** `ArrayList/src/`

Explores dynamic resizable arrays using the ArrayList collection.

**Classes:**
- `Main.java` - Comprehensive ArrayList operations

**Key Concepts:**
- Resizable array that stores objects
- Type-safe using generics (e.g., `ArrayList<String>`)
- Common methods:
  - `add()` - Add elements
  - `remove()` - Remove by value or index
  - `set()` - Modify elements
  - `get()` - Retrieve elements
  - `size()` - Get collection size
  - `sort()` - Sort elements using Collections

**Example:**
```java
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.remove("Apple");
Collections.sort(fruits);
```

---

### 4. **Enum**
**Location:** `Enum/src/`

Implements enumerations - a special data type for fixed sets of constants.

**Classes:**
- `Numbers.java` - Enum for numbers (ONE, TWO, THREE)
- `WeekDays.java` - Enum for days of the week with status methods
- `Months.java` - Enum for months with parameterized constructors and day counts
- `Operation.java` - Enum for mathematical operations
- `OrderStatus.java` - Enum for order statuses
- `Main.java` - Examples of enum usage

**Key Concepts:**
- Enums represent fixed sets of constants
- Improve code readability and maintainability
- More efficient than strings in switch statements
- Can have constructors, methods, and fields
- Iteration using `values()` method

**Example:**
```java
Numbers num = Numbers.ONE;
switch(num) {
    case ONE: System.out.println(1); break;
    case TWO: System.out.println(2); break;
}

// Parameterized Enum
System.out.println(Months.JANUARY.getDays());  // 31
```

---

### 5. **Exception Handling**
**Location:** `Exception/src/`

Demonstrates proper exception handling using try-catch-finally blocks.

**Classes:**
- `Main.java` - Exception handling examples

**Key Concepts:**
- Exceptions interrupt normal program flow
- Common exceptions: ArithmeticException, NumberFormatException, etc.
- Try-catch-finally blocks for error handling
- Multiple catch blocks for specific exception types
- Exception hierarchy (RuntimeException, Exception, etc.)

**Covered Scenarios:**
- Division by zero
- Input type mismatch
- Specific exception types vs. generic Exception

**Example:**
```java
try {
    int x = Integer.valueOf(scan.nextLine());
} catch (NumberFormatException e) {
    System.out.println("This is not an integer number");
}
```

---

### 6. **HashMap**
**Location:** `Hashmaps/src/`

Explores key-value pair storage using HashMap data structure.

**Classes:**
- `Main.java` - HashMap operations and demonstrations

**Key Concepts:**
- Stores key-value pairs (HashMap<Key, Value>)
- Keys are unique; values can be duplicated
- Does not maintain insertion order
- Memory efficient
- Uses wrapper classes for keys and values

**Common Methods:**
- `put()` - Add or override key-value pairs
- `get()` - Retrieve value by key
- `remove()` - Remove key-value pair
- `containsKey()` - Check if key exists
- `keySet()` - Get all keys for iteration
- `size()` - Get number of pairs
- `clear()` - Remove all entries

**Example:**
```java
HashMap<String, Integer> mp = new HashMap<>();
mp.put("apple", 50);
mp.put("banana", 32);
for(String key : mp.keySet()) {
    System.out.println(key + " ; " + mp.get(key));
}
```

---

### 7. **Wrapper Classes**
**Location:** `Wrapper Class/src/`

Demonstrates converting primitive types to objects using wrapper classes.

**Classes:**
- `Main.java` - Wrapper class implementations

**Key Concepts:**
- Wrapper classes convert primitives to objects
- Allows primitives to be used in collections and streams
- Types: Integer, Double, Character, Boolean, String, etc.
- **Autoboxing** - Automatic conversion from primitive to wrapper
- **Unboxing** - Automatic conversion from wrapper to primitive
- Useful for collection framework and static utility methods

**Example:**
```java
// Autoboxing
Integer a2 = 5;
Double b2 = 5.5;

// Unboxing
int a3 = a2;
double b3 = b2;

// Casting
String s2 = Integer.toString(548);
```

---

### 8. **Reference Casting**
**Location:** `Refrence Casting/src/`

Covers upcasting and downcasting in object-oriented programming.

**Classes:**
- `Animal.java` - Parent class
- `Mammal.java` - Inherits from Animal
- `Lion.java` - Inherits from Mammal
- `Main.java` - Casting examples

**Key Concepts:**
- **Upcasting** - Converting child reference to parent type
- Can access only parent class methods
- Method overriding applies with upcasting
- Child-specific methods not visible through parent reference
- Safe and implicit conversion

**Example:**
```java
Animal animal2 = new Mammal();  // Upcasting
animal2.eat();   // Calls overridden method
animal2.sleep();
// animal2.control(); // Error - method not in Animal
```

---

### 9. **Date and Time**
**Location:** `Date and Time/src/`

Working with dates and times using Java's modern time API.

**Classes:**
- `Main.java` - Date and time operations

**Key Concepts:**
- `LocalDate` - Date without time
- `LocalTime` - Time without date
- `LocalDateTime` - Combined date and time
- `Instant` - UTC timestamp
- `DateTimeFormatter` - Format dates and times
- Date comparison methods: `isBefore()`, `isAfter()`, `isEqual()`

**Example:**
```java
LocalDate date = LocalDate.now();
LocalDateTime dateTime = LocalDateTime.now();
DateTimeFormatter formatter = 
    DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
String formatted = dateTime.format(formatter);
```

---

### 10. **Anonymous Classes**
**Location:** `Anonymous Class/src/`

Demonstrates anonymous inner classes for one-time use cases.

**Classes:**
- `Dog.java` - Base class
- `Cat.java` - Interface for implementing anonymously
- `Main.java` - Anonymous class examples

**Key Concepts:**
- Anonymous classes don't have a name
- Cannot be reused
- Used for one-time custom behavior
- Can extend a class or implement an interface
- Common in callbacks, TimerTask, Runnable
- Compiler generates name like `Main$1`, `Main$2`, etc.

**Example:**
```java
Dog german = new Dog() {
    @Override
    public void Sound() {
        System.out.println("Rar Rar Rar");
    }
};
```

---

### 11. **Write and Read Files**
**Location:** `Write and Read Files/src/`

File I/O operations for reading and writing text files.

**Classes:**
- `Main.java` - File operations

**Key Concepts:**
- **FileWriter** - Good for small/medium text files
- **BufferedWriter** - Better performance for large amounts of text
- **PrintWriter** - Best for structured data (reports, logs)
- **FileOutputStream** - Best for binary files
- **BufferedReader** - Efficient reading of text files
- **FileReader** - Basic file reading
- Try-with-resources for automatic resource management

**Example:**
```java
try (FileWriter writer = new FileWriter("text.txt")) {
    writer.write("I Love Pizza\nAnd I love meat");
    System.out.println("Write Successfully");
} catch (IOException e) {
    System.out.println("Error: can't write");
}
```

---

## Getting Started

### Prerequisites
- Java JDK 8 or higher installed
- IntelliJ IDEA or any Java IDE
- Basic understanding of Java fundamentals

### Running the Projects
1. Clone the repository:
   ```bash
   git clone https://github.com/abdallahesham012/JavaFundamentals-.git
   cd JavaFundamentals 
   ```

2. Open the project in IntelliJ IDEA or your preferred IDE

3. Navigate to any module and run the `Main.java` class:
   - Right-click on Main.java
   - Select "Run 'Main.main()'"

4. View the console output for results

---

## Learning Path

Suggested order for learning:
1. **Wrapper Classes** - Understand primitive to object conversion
2. **ArrayList** - Learn about dynamic collections
3. **HashMap** - Explore key-value storage
4. **Enum** - Understand constant sets
5. **Composition** - Learn tight coupling relationships
6. **Aggregation** - Learn loose coupling relationships
7. **Reference Casting** - Understand inheritance hierarchies
8. **Anonymous Classes** - Learn inner classes
9. **Exception Handling** - Handle runtime errors
10. **Date and Time** - Work with temporal data
11. **Write and Read Files** - Persist data to files

---

## Topics Covered

- Object-Oriented Programming (OOP)
-  Inheritance and Polymorphism
-  Composition vs. Aggregation
-  Collections Framework (ArrayList, HashMap)
-  Enumerations (Enums)
-  Exception Handling
-  Wrapper Classes and Autoboxing
-  Anonymous Inner Classes
-  Date and Time API
-  File I/O Operations

---

## Additional Resources

- [Java Official Documentation](https://docs.oracle.com/javase/)
- [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/)
- [Java Collections Framework](https://docs.oracle.com/javase/tutorial/collections/index.html)

---

## Contributing

Feel free to contribute improvements, bug fixes, or additional examples. Fork the repository and submit a pull request.

---

## Author

Created by Abdallah Hesham as a learning resource for Java fundamentals and OOP concepts.

---

**Happy Learning!**
