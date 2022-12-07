package com.praticando.validation.configs;

import com.praticando.validation.models.Endereco;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTamplateEndereco {

    public Endereco buscarCep(String cep){
         String url = "https://viacep.com.br/ws/" + cep + "/json";
        return new RestTemplate().getForObject(url, Endereco.class);

    }
}
