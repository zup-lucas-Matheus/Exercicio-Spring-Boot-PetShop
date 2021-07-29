package com.br.zup.PetShop.dominio;

public class Animal {

    //Atributos...
    private String nome;
    private int idade;
    private Dono dono;
    private Especie especie;

    //Metódo construtor.
    public Animal(){

    }

    public Animal(String nome, int idade, Dono dono, Especie especie) {
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
        this.especie = especie;
    }

    //Metódo seletores e modificadores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }


}
