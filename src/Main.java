//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA EXPERTO DE DIAGNOSTICO INDUSTRIAL ===");

        System.out.print("Temperatura (°C): ");
        double temp = sc.nextDouble();

        System.out.print("Nivel de vibracion (mm/s): ");
        double vib = sc.nextDouble();
        sc.nextLine();

        System.out.print("Tipo de ruido (friccion / golpeteo / zumbido): ");
        String ruido = sc.nextLine();

        System.out.print("Frecuencia vibracion (1xRPM / normal): ");
        String freq = sc.nextLine();

        System.out.print("Presion (estable / inestable): ");
        String presion = sc.nextLine();

        System.out.print("Amperaje del motor: ");
        double amp = sc.nextDouble();

        Hechos hechos = new Hechos(temp, vib, ruido, freq, presion, amp);

        String resultado = MotorInferencia.diagnosticar(hechos);

        System.out.println("\nResultado del sistema experto:");
        System.out.println(resultado);

        sc.close();
    }
}