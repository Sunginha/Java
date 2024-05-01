import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args){
        Scanner seer = new Scanner(System.in);
        Double valor_Produto, preco_Venda;

        // Entrada de Dados
        System.out.print("Qual Valor Do Produto:");
        valor_Produto = seer.nextDouble();
        System.out.print("Qual Preço de Venda:");
        preco_Venda = seer.nextDouble();

        // Calculo do Lucro
        final Double lucro_Produto = preco_Venda - valor_Produto;
        
        // Resultado
        System.out.print("O valor praticado é R$" + preco_Venda + " , foi comprado por R$"+ valor_Produto + " e possui um lucro de R$" +lucro_Produto);
    }
}
