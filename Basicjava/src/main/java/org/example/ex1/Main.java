package org.example.ex1;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario(1,
                "Yan",
                24,
                3500.0,
                Setor.VENDAS,
                Sexo.MASCULINO);

        System.out.println(funcionario1.toString());

    }
}
