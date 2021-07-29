package com.br.zup.PetShop.dominio;


import javax.validation.constraints.NotBlank;

public class Dono {

    //Atributos com a validação do spring boot, onde meu atributo nome não pode ser null
    @NotBlank(message = "Nome do responsável é obrigatório")
    private String nome;

    //Atributos com a validação do spring boot, onde meu atributo email não pode ser null
    @NotBlank(message = "Email do responsável é obrigatório")
    private String email;
    private String telefone;

    //Metódo Construtor
    public Dono(){

    }

    public Dono(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    //Metódo seletores e modificadores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}
