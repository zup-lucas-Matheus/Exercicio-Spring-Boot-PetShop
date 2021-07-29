package com.br.zup.PetShop.service;

import com.br.zup.PetShop.dominio.Animal;
import com.br.zup.PetShop.dominio.Dono;
import org.springframework.stereotype.Service;

import java.awt.dnd.DnDConstants;
import java.util.ArrayList;
import java.util.List;

// classe serviço onde ira passar esse serviço para a minha classe controller
@Service
public class PetShopService {

    //Atributor list onde adicionarei os animais na lista animals
    private List<Animal> animals = new ArrayList<>();


    //Metódo para adicionar o animal na minha lista.
    public void adicionarAnimal(Animal animal){

        for (Animal ListaDePets: animals) { //Esse for estou fazendo uma validação se o animal tivel o mesmo nome da animal cadastrado.
            if (ListaDePets.getNome().equals(animal.getNome())) {
                throw new RuntimeException("Animal já cadastrado");
            }
        }
        animals.add(animal);

    }

    //Metódo para mostrar o animal.
    public List<Animal> retornarAnimal(){

        return this.animals;
    }

}
