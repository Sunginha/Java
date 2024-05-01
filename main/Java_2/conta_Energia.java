import java.util.Scanner;
public class conta_Energia 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        char typeOfBuilding = ' ';

        final double RESIDENTIALTYPE = 0.50, COMERCIALTYPE = 0.70, INDUSTRIALTYPE = 0.40;
        float lastMeasure, currentMeasure;
        int residential = 0, comercial = 0, industrial = 0;

        for (int i = 0; i < 4; i++)
        {
            do {
                System.out.print("What type of building is yours [R/C/I]: ");
                typeOfBuilding = input.nextLine().toUpperCase().charAt(0);
            } while (typeOfBuilding != 'R' && typeOfBuilding != 'C' && typeOfBuilding != 'I');
            do {
                System.out.print("How much was last measure:");
                lastMeasure = input.nextFloat();
                if (lastMeasure < 0){
                    System.out.println("Invalid Number");
                }
            } while (lastMeasure < 0);
        }
            
    }
}

