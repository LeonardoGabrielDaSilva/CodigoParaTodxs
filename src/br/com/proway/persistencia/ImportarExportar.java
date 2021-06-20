/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.proway.persistencia;

import br.com.proway.model.Pessoa;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo Gabriel
 */
public class ImportarExportar {

    /**
     * Realiza exportação dos dados dos contratos assinados
     * @param lista
     * @return
     * @throws IOException 
     */
    public boolean exportarPessoa(List<Pessoa> lista) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        try (FileWriter writer = new FileWriter("json/Pessoas.json")) {
            writer.write(gson.toJson(lista));
        }
        return true;
    }

    /**
     * Realiza a importação dos dados dos contratos assinados
     * @param lista
     * @return
     * @throws IOException 
     */
    public List<Pessoa> importarPessoa(List<Pessoa> lista) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("json/Pessoas.json"));
            Type listType = new TypeToken<ArrayList<Pessoa>>() {
            }.getType();
            lista = new Gson().fromJson(bufferedReader, listType);
            return lista;
        } catch (java.io.FileNotFoundException e) {
            new File("json").mkdir();
            return lista;
        }
    }
}
