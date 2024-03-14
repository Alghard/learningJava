public class conditionalHello {
    public static void main(String[] args) {
        switch(args.length)
        {
            case 0:         //aucun argument n'a été envoyé
                sayHelloTo("world");
                break;
            case 1:         // l'utilisateur a fourni un argument dans le terminal
                sayHelloTo(args[0]);
                break;
            case 2:         // l'utilisateur a fourni 2 arguments
                sayHelloTo(args[0] + " et " + args[1]);
                break;
            case 3:
                sayHelloTo(args[0] + ", " + args[1] + " et " + args[2]);
                break;
            default:        // l'utilisateur a fourni plus d'arguments qu'on peut en gérer
                System.out.println("Sorry, je ne sais pas gérer plus de 3 noms");
        }
    }

    private static void sayHelloTo(String recipient) {
        System.out.println("Hello " + recipient + "!");
    }
}
