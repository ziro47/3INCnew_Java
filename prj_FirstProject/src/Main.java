import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Yo, type smth");
        Scanner in = new Scanner(System.in);

        String parola = in.nextLine();
        System.out.println(parola);

        Pokemon p = new Pokemon ("Gengar", 250, "Dark", "DarkSlash");
        System.out.println(p.Display());

    }
}
