/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.proway.util;

import br.com.proway.model.Endereco;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Leonardo Gabriel
 */
public class ConsultasUtil {
    
    
    /**
     * Realiza uma consulta webService para buscar o Cep do Usuário
     * @param cep
     * @return
     * @throws IOException 
     */
     public Endereco buscarCep(String cep) throws IOException 
    {
        String json;        

        
            Endereco endereco = new Endereco();
            URL url = new URL("http://viacep.com.br/ws/"+ cep +"/json");
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));
            json = jsonSb.toString();
            
            json = json.replaceAll("[{},:]", "");
            json = json.replaceAll("\"", "\n");                       
            String array[] = new String[30];
            array = json.split("\n");
            
            endereco.setCep(cep);
            endereco.setLogradouro(array[7]);
            endereco.setBairro(array[15]);
            endereco.setCidade(array[19]);
            endereco.setEstado(array[23]);
            
            return endereco;
        
        
    }
    
}
