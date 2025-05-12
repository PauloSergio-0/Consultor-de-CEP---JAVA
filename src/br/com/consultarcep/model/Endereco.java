package br.com.consultarcep.model;

public class Endereco {
    private String cep;
    private String regiao;
    private String estado;
    private String uf_estado;
    private String cidade;
    private String bairro;
    private String logradouro;
    private String complemento;
    private int ddd;
    private int cod_ibge;

   public Endereco(ViaCepJson viaCepJson){
        this.cep = viaCepJson.cep();
        this.regiao = viaCepJson.regiao();
        this.estado = viaCepJson.estado();
        this.uf_estado = viaCepJson.uf();
        this.cidade = viaCepJson.localidade();
        this.bairro = viaCepJson.bairro();
        this.logradouro = viaCepJson.logradouro();
        this.complemento = viaCepJson.complemento();
        this.ddd = Integer.parseInt(viaCepJson.ddd());
        this.cod_ibge = Integer.parseInt(viaCepJson.ibge());
   }


    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", regiao='" + regiao + '\'' +
                ", estado='" + estado + '\'' +
                ", uf_estado='" + uf_estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", ddd=" + ddd +
                ", cod_ibge=" + cod_ibge +
                '}';
    }
}
