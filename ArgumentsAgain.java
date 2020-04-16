public class ArgumentsAgain {
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            StringBuilder input = new StringBuilder();
            input.append(args[i]);
            System.out.println(input.reverse());
        }
    }
}
