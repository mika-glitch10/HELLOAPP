public class HelloApp {

    public static void main(String[] args) {

        String greeting;

        if (args.length > 0) {
            StringBuilder names = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);

                if (i < args.length - 1) {
                    names.append(", ");
                }
            }

            greeting = "Hello, " + names.toString() + "!";
        } else {
            greeting = "Hello, World!";
        }

        System.out.println(greeting);
    }
}
	