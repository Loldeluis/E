import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de kilovoltios necesarios: ");
        double kilovoltiosNecesarios = scanner.nextDouble();

        double capacidadNaranja = 0.05; // Voltios por naranja
        double voltiosNecesarios = kilovoltiosNecesarios * 1000; // Convertir kilovoltios a voltios

        int naranjasNecesarias = (int) (voltiosNecesarios / capacidadNaranja);
        double pesoNaranjasToneladas = (naranjasNecesarias * 6) / 1000000.0; // Convertir gramos a toneladas

        System.out.println("Se necesitan " + naranjasNecesarias + " naranjas para producir " + kilovoltiosNecesarios + " kilovoltios.");
        System.out.println("El peso necesario es de " + pesoNaranjasToneladas + " toneladas.");
    }
}