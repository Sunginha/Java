import java.util.Scanner;
public class Atividade_3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String trafficLightCollor;
        
        System.out.print("What collor is the traffic light?");
        trafficLightCollor = input.nextLine().toLowerCase();

        if (trafficLightCollor != "green") {
            System.out.print("STOP!");
        } 
    }
}
