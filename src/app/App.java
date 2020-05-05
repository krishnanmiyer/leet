package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        reverseintegers rev = new reverseintegers();
        int output = rev.reverse(12345);
        System.out.println(output);
    }
}