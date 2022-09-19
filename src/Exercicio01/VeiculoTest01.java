package Exercicio01;

import java.util.Scanner;

public class VeiculoTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veiculo v1 = new Veiculo();
        System.out.println("Informe o marca: ");
        v1.marca = scanner.next();
        System.out.println("Qual o modelo: ");
        v1.modelo = scanner.next();
        System.out.println("A placa: ");
        v1.placa = scanner.next();
        System.out.println("Qual o a cor? ");
        v1.cor = scanner.next();
        System.out.println("Quantos Km? ");
        v1.km = scanner.nextFloat();
        //System.out.printf("ligado");
        System.out.println("Quantos litros Combustivel:  ");
        v1.litrosCombustivel = scanner.nextInt();
        System.out.println("Qual a velocidade? ");
        v1.velocidade = scanner.nextInt();
        System.out.println("Qual o preco? ");
        v1.preco = scanner.nextDouble();
        System.out.println("Marca: "+v1.marca);
        System.out.println("Modelo: "+v1.modelo);
        System.out.println("Placa: "+v1.placa);
        System.out.println("Cor: "+v1.cor);
        System.out.println("Km: "+v1.km);
        System.out.println("ligado: "+v1.ligado);
        System.out.println("Quantos litros Combustivel: "+v1.litrosCombustivel);
        System.out.println("Velocidade: "+v1.velocidade);
        System.out.println("Preco: "+v1.preco);
        v1.ligar();
        v1.pintar();
        v1.acelerar();
        v1.frear();
        v1.desligar();
        v1.abastecer(scanner.nextInt());

        






    }
}
