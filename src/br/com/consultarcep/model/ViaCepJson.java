package br.com.consultarcep.model;

public record ViaCepJson(
         String cep,
         String logradouro,
         String complemento,
         String bairro,
         String localidade,
         String uf,
         String estado,
         String regiao,
         String ibge,
         String ddd
        ) {

}
