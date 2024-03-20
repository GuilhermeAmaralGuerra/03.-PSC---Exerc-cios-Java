//(Decom/UFOP) Na lojinha do Sr. Aboo, encontramos produtos de informática com preços especiais. 
//Mas o Sr. Aboo segue uma receita de seus antepassados para acrescentar uma porcentagem sobre o valor de custo do produto, 
//garantindo assim, a estabilidade financeira das futuras gerações de sua família. A tabela abaixo, feita pelo avô do Sr. Aboo, 
//descreve o valor do lucro de um produto, considerando o valor de compra do mesmo.
//Para auxiliar o Sr. Aboo, codifique um programa que leia o valor da compra de um produto de informática e imprima a porcentagem do 
//lucro e o valor da venda.  O programa deve exibir a mensagem "Lojinha do Sr. Aboo" e em seguida solicitar o valor da compra com o 
//fornecedor, e, em seguida, exibir qual será a porcentagem de lucro e o valor que o item deve ser colocado para venda.

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double preco, porcentagem, total;

        System.out.println("Digite o preço do produto: ");
        preco = input.nextDouble();

        porcentagem = preco / 100;

        if (preco < 10){
            total = preco + (porcentagem * 70);
            System.out.println("O preco do produto com a margem de lucro é: " + total);
        } else if (preco >= 10 && preco < 30) {
            total = preco + (porcentagem * 50);
            System.out.println("O preco do produto com a margem de lucro é: " + total);
        } else if (preco >= 30 && preco < 50) {
            total = preco + (porcentagem * 40);
            System.out.println("O preco do produto com a margem de lucro é: " + total);
        } else {
            total = preco + (porcentagem * 30);
            System.out.println("O preco do produto com a margem de lucro é: " + total);
        }
        input.close();
    }
}
