public class O4UC3 {

public static void main(String[] args) {

// Use ternary operator to assign default value
String name = (args.length > 0) ? args[0] : "World";

// Print greeting
System.out.println("Hello, " + name + "!");
}
}