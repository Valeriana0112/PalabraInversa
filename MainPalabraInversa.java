import java.util.Scanner;

public class MainPalabraInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalabraInversa pal = new PalabraInversa();
        System.out.println("INGRESAR PALABRA:");
        pal.setPalabra(sc.nextLine());
        System.out.println(pal.invertir());
        System.out.println(pal.toString());
        pal.getPalabra();
        pal.getInvertir();
    }
}
