//Crie um algoritmo que leia dois números e exiba o resultado da divisão entre eles. 
//O algoritmo deverá seguir todas as regras da divisão de números reais.
import java.util.Scanner;

public class Questao1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = input.nextDouble();

        if (num2 == 0) {
            System.out.println("Não é possível dividir um número por 0!");
        } else {
            double calculo;
            calculo = num1 / num2;  
            System.out.println("O resultado do cálculo é: " + calculo);      
        }
        input.close();
    }
}
