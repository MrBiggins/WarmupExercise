public class Main {

    public static void main(String[] args) {
        String argsMessage = "";
        for (int i=0; i<args.length; i++) {
            argsMessage+= String.format(" %s", args[i]);

        }
        System.out.println(String.format("Hello World! %s ",argsMessage));
    }
}
