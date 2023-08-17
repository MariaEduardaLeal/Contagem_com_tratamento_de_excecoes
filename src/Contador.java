import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scan.nextInt();

        try {
            // Tentar executar o método contar, que pode lançar uma exceção
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){
            // Capturar a exceção ParametrosInvalidosException e exibir a mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        }



    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois){
            // Lançar a exceção se os parâmetros forem inválidos
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor que o segundo parâmetro");
        }else{
            int contagem = parametroDois - parametroUm;

            for (int indice = 0;  indice < contagem; indice++){
                System.out.println(indice);
            }
        }
    }
}
