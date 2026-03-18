public class O5UC4 {
public static void main(String[] args) {

String result;
if (args.length > 0) {
String names = String.join(", ", args);
result = "Hello, " + names + "!";
} else {
result = "Hello, World!";
}
System.out.println(result);
}
}