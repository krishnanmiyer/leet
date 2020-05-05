package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Practice");

        ReverseInteger rev = new ReverseInteger();
        //int output = rev.reverse(12345);
        int output = rev.reverseLeet(12345);
        System.out.println(output);
    }
}