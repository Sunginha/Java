import java.util.Scanner;
public class atividade_peso {
    public static void main(String[] args) 
    {   
        Scanner input = new Scanner(System.in);
        float biggestWeight, personWeight;

        biggestWeight = 0;

        for (int i = 0; i < 4; i++){
            
            do {
                System.out.print("Weight:");
                personWeight = input.nextFloat();
                if (personWeight < 0 || personWeight == 0)
                {
                    System.out.println("Invalid Weight.");
                }
            } while (personWeight < 0 || personWeight == 0);
                

            if (personWeight > biggestWeight){
                biggestWeight = personWeight;
            }
        }
        System.out.print(biggestWeight);
    }
}
