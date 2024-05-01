import java.util.Scanner;
public class Atividade3 {
    public static void main (String[] args) {
        //Library
        Scanner seer = new Scanner(System.in);

        // Variables
        Double periodoTurnoDia, periodoTurnoNoite;

        // Input
        System.out.print("Quantas horas você trabalhou (Período Diurno):");
        periodoTurnoDia = seer.nextDouble();
        System.out.print("Quantas horas você trabalhou (Período Noturno):");
        periodoTurnoNoite = seer.nextDouble();

        // Calculation
        final Double salarioDiurno = periodoTurnoDia * 10;
        final Double salarioNoturno = periodoTurnoNoite * 10 * 1.5;
        final Double salarioIntegral = salarioDiurno + salarioNoturno;
        
        // Output
        System.out.println("Salário Noturno: R$" + salarioNoturno);
        System.out.println("Salário Diurno: R$" + salarioDiurno);
        System.out.println("Salário total: R$" + salarioIntegral);
        }
        }

