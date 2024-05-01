import java.util.Scanner;
public class Atividade2 {
    public static void main (String[] args) {
        Double hora;
        Scanner hreader = new Scanner(System.in);
        

        System.out.print("Digite o horario escolhido (0 a 24):");
        hora = hreader.nextDouble();


        final Double conversor_Minuto = hora * 60;
        final Double conversor_Segundos = conversor_Minuto * 60;

        if (hora == 1) {
            System.out.print(hora + " Hora também é: " + conversor_Minuto + " minutos ou " + conversor_Segundos + " segundos");

        }
        else {
            System.out.print(hora + " Horas também é: " + conversor_Minuto + " minutos ou " + conversor_Segundos +" segundos");
        }

    }
}
