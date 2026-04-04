public class UC7 {
        public static void main(String[] args) {

            String names = "World";

            // If arguments are provided, join them with ", "
            if (args.length > 0) {
                names = String.join(", ", args);
            }

            // Print the greeting
            System.out.println("Hello, " + names + "!");
        }
    }
	