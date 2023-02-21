package br.com.dio.primeiro;

import model.Gato;

public class SegundoPrograma {

    public static void main(String[] args) {
        /*int a = 5;
        int b = 3;
        System.out.println(" HELLO WORLD THAYANA ");*/

        Gato gato = new Gato();
        System.out.println(gato);

        Animal animal01 = new Animal(nome" Cachorro", raca indefinida);
        System.out.println(raca);

    }
}

 class  Animal{
    private String nome;
    private String raca;

     public Animal(String nome, String raca) {
         this.nome = nome;
         this.raca = raca;
     }

     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public String getRaca() {
         return raca;
     }

     public void setRaca(String raca) {
         this.raca = raca;
     }

     @Override
     public String toString() {
         return "Animal{" +
                 "nome='" + nome + '\'' +
                 ", raca='" + raca + '\'' +
                 '}';
     }
 }



