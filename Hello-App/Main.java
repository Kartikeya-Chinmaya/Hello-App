public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder greeting = new StringBuilder("Hello, ");
            for (String name : args) {
                greeting.append(name).append(", ");
            }
            greeting = new StringBuilder(greeting.substring(0, greeting.length() - 2));
            System.out.println(greeting + "!");
        }
    }
}