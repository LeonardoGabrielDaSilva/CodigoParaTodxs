/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.proway.util;

import br.com.proway.model.Endereco;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.text.Normalizer;

/**
 *
 * @author Leonardo Gabriel
 */
public class ConsultasUtil {

    /**
     * Realiza uma consulta webService para buscar o Cep do Usuário
     *
     * @param cep
     * @return
     * @throws IOException
     */
    public Endereco buscarCep(String cep) throws IOException {
        Type listType = new TypeToken<Endereco>() {}.getType();
        URL url = new URL("http://viacep.com.br/ws/" + cep + "/json");
        URLConnection urlConnection = url.openConnection();
        InputStream is = urlConnection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
        return new Gson().fromJson(br, listType);
    }
}
