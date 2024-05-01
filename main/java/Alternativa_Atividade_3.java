import java.util.Scanner;
public class Alternativa_Atividade_3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int trafficLightCollor;

        System.out.print("Collors of the traffic light: \n 1 - Red \n 2 - Yellow \n 3 - Green \n What collor do you want?");
        trafficLightCollor = input.nextInt();

        if (trafficLightCollor == 1 || trafficLightCollor == 2) {
            System.out.print("STOP!!!!");
        } else {
            System.out.print("Passage granted.");
        }
    }
}
