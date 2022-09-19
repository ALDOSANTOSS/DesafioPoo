package Exercicio040506;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PessoaTesT {
    public static void main(String[] args) {

        List<Pessoa> pessoas  = new ArrayList<>();
        pessoas.add(new Pessoa("Joao",15));
        pessoas.add(new Pessoa("Leandro",21));
        pessoas.add(new Pessoa("Paulo",17));
        pessoas.add(new Pessoa("Jessica",18));

        // Exercicio04

        Pessoa maisVelho  = pessoas.stream()
               .max(Comparator.comparing(Pessoa::getIdade)).get();
        System.out.println("Pessoa mais velha: " + maisVelho);

        // Exercicio05

        List<Pessoa> Pessoa = pessoas.stream()
                .filter(i -> i.getIdade() >= 18).toList();
        System.out.println("O resto de pessoas: " + Pessoa.size());

        //Exercicio06


        List<Pessoa> pessoas1 = pessoas.stream()
                .filter(i -> i.getNome().equalsIgnoreCase("Jessica"))
                .collect(Collectors.toList());
        System.out.println(pessoas1);






    }

}
