package org.example.ex2;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua", "475", "Casa", "40370006", "Salvador", UnidadeFederativa.BAHIA);
        Pessoa pessoa1 = new Pessoa(1,"Yan", "(71)98524-2246", "yanmendes50@gmail.com", Sexo.MASCULINO, endereco1);

        System.out.println(pessoa1.toString());
    }
}
