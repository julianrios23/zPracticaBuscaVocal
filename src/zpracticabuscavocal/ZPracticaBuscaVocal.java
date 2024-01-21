package zpracticabuscavocal;

import java.util.Scanner;

public class ZPracticaBuscaVocal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase:");
        String palabra = leer.nextLine();

        PrimerVocal pv = new PrimerVocal(palabra);
        pv.comprobarPrimeraLetra();

    }

}
