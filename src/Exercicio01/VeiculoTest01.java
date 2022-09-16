package Exercicio01;

import java.util.Scanner;

public class VeiculoTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veiculo v1 = new Veiculo();
        System.out.printf("Informe o marca: ");
        v1.marca = scanner.next();
        // System.out.printf("Marca: "+v1.marca);
        System.out.printf("Qual o modelo: ");
        v1.modelo = scanner.next();
        System.out.printf("A placa: ");
        v1.placa = scanner.next();
        System.out.printf("Qual o a cor? ");
        v1.cor = scanner.next();
        System.out.printf("Quantos Km? ");
        v1.km = scanner.nextFloat();
        // System.out.printf("ligado");
        System.out.printf("Quantos litros Combustivel? ");
        v1.litrosCombustivel = scanner.nextInt();
        System.out.printf("Qual a velocidade? ");
        v1.velocidade = scanner.nextInt();
        System.out.printf("Qual o preco? ");
        v1.preco = scanner.nextDouble();



    }
}
