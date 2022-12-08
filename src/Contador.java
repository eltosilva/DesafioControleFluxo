import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int parametro1 = scanner.nextInt();
        System.out.println("Digite um número inteiro maior que o anterior");
        int parametro2 = scanner.nextInt();

        int diferenca = parametro2 - parametro1;

        try{
            contar(diferenca);
        }catch(ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }
    }

    private static void contar(int quantidadeLoops) throws ParametrosInvalidosException{
        if(quantidadeLoops <= 0)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        for(int i = 1; i <= quantidadeLoops; i++)
            System.out.println("Imprimindo o número " + i);
    }
}
