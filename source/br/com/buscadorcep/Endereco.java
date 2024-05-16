package source.br.com.buscadorcep;

/**
 * Classe Endereco representa o endereço do usuário, utilizada para o encapsulamento e conversão para String do mesmo.
*/
public class Endereco{
    private String uf;
    private String localidade;
    private String bairro;
    private String logradouro;

    Endereco(String uf, String localidade, String bairro, String logradouro){
        this.uf = uf;
        this.localidade = localidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
    }

    private String getUf(){
        return uf;
    }

    private String getLocalidade(){
        return localidade;
    }

    private String getBairro(){
        return bairro;
    }

    private String getLogradouro(){
        return logradouro;
    }

    @Override
    public String toString(){
        return "Este CEP corresponde ao seguinte endereço:\n- UF: " + getUf() +
                                                         "\n- Cidade:" + getLocalidade() +
                                                         "\n-Bairro: " + getBairro() +
                                                         "\n-Logradouro: " + getLogradouro();
    }
}