public class HELLOAPP {

    public static void main(String[] args) {

        StringBuilder names = new StringBuilder();

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            boolean first = true;

            for (String name : args) {
                if (!first) {
                    names.append(", ");
                }
                names.append(name);
                first = false;
            }

            System.out.println("Hello, " + names.toString() + "!");
        }
    }
}
	