package com.br.zup.PetShop.sistema;


import com.br.zup.PetShop.dominio.Animal;
import com.br.zup.PetShop.dominio.Dono;
import com.br.zup.PetShop.service.PetShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

// Minha classe controller
@RestController
@RequestMapping("/petshops")
public class PetShopController {
    //Atributo onde recebo minha classe de Serviço, onde o @Autowired já injeta nela todos as responsabilidade passaadas.
    @Autowired
    private PetShopService petShopService;

    // Meu metódo List onde eu cadastro meu animal e trago o meu serviço para ser realizada e o meu controller(Porteiro) repassar para o usuário.
    @PostMapping
    public List<Animal> cadastrarAnimal (@RequestBody Animal animal){

        try { // Um try para a validação do meu animal caso seja o mesmo nome. Não é necessarío só para aprendizado.

            petShopService.adicionarAnimal(animal);

        }catch (RuntimeException erro){
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, erro.getMessage());
        }

        return petShopService.retornarAnimal(); // Onde eu retorno o cadastro do animal com o todas as informações

    }

    //Metódo para visualizar meu cadastro de animal onde ele passara na tela todas as informações.
    @GetMapping
    public List<Animal> visualizarListaDeAnimal(){

        return petShopService.retornarAnimal();
    }


}
