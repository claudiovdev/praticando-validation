package com.praticando.validation.models;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
    public String cep;
    public String logradouro;
    public String complemento;
    public String bairro;
    public String localidade;
    public String uf;
}
