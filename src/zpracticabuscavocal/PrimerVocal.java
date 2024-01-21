package zpracticabuscavocal;

public class PrimerVocal {

    private final String palabra;

    public PrimerVocal(String palabra) {
        this.palabra = palabra;
    }

    public void comprobarPrimeraLetra() {
        if (palabra.substring(0, 1).equals("A") || palabra.substring(0, 1).equals("a")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }
}
