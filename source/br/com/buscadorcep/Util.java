package source.br.com.buscadorcep;

import java.io.BufferedReader;
import java.io.IOException;

public class Util {
    
    /**
     * @param bReader BufferedReader da resposta em Json da API
     * @return Retorna o Json em formato de String
     * @throws IOException
     */
    public static String converteJsonEmString (BufferedReader bReader)throws IOException{
        String resposta, jsonString = "";

        while ((resposta = bReader.readLine()) != null) jsonString += resposta;

        return jsonString;
    }

    //To-do: método que pega a string convertida do json e cria um endereço da classe Endereco, e retorna.
}
