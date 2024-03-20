//(Decom/UFOP - Adaptado) A permissão para uma pessoa votar ou não é determinado pela idade dela, conforme a tabela:
//Idade (anos)
//Classificação
//menor que 16
//Não é eleitor
//de 16 a 17
//Eleitor facultativo
//de 18 a 65
//Eleitor obrigatório
//acima de 65
//Eleitor facultativo
//Crie um programa capaz de ler a idade de uma pessoa e imprimir sua classificação eleitoral. Entrada: QUAL A IDADE DA PESSOA?: 17
//Saída: ELEITOR FACULTATIVO

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double idade;

        System.out.println("Digite sua idade: ");
        idade = input.nextDouble();

        if (idade < 16){
            System.out.println("Você não pode votar.");
        } else if (idade >= 16 && idade < 18 ){
            System.out.println("Eleitor facultativo");
        } else if(idade >= 18 && idade <= 65){
            System.out.println("Eleitor obrigatório");
        } else {
            System.out.println("Eleitor facultativo");
        }
        input.close();
    }
}