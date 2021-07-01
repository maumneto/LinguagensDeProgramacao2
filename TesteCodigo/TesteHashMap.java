/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteCodigo;

import java.util.HashMap;   
import java.util.Map;
/**
 *
 * @author mauricio.moreira
 */
public class TesteHashMap {
    public HashMap<String, String> getStates() {
        HashMap<String, String> estados = new HashMap<>();
        estados.put("AC", "Acre");
        estados.put("CE", "Ceará");
        estados.put("AM", "Amazonas");
        estados.put("SP", "São Paulo");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RS", "Rio Grande do Sul");
        return estados;
    }
    
    public void showUFMap() {
        HashMap<String, String> estados = getStates();
        for (String uf: estados.keySet()) {
            System.out.println("UF: " + uf);
        }
    }
    
    public void showStates() {
        HashMap<String, String> estados = getStates();
        for (Map.Entry<String, String> data: estados.entrySet()) {
            System.out.println(data.getKey());
            System.out.println(data.getValue());
        }
    }
    
    public void exampleHash() {
        HashMap<Integer, String> exampleHash = new HashMap<>();
        
        for (int i = 0; i < 5; i++) {
            exampleHash.put(i, "Testando " + i);
        }
        System.out.println(exampleHash);
        
        for (int i = 0; i < 5; i++) {
            System.out.println(exampleHash.get(i));     
        }
        
        if (exampleHash.isEmpty()) {
            System.out.println("Está vazio!");
        } else {
            System.out.println("Não está vazio!");
        }
    }
    
    public static void main(String[] args) {
        TesteHashMap teste = new TesteHashMap();
        //teste.exampleHash();
        HashMap<String, String> hash = teste.getStates();
        teste.showUFMap();
        teste.showStates();
        teste.exampleHash();
    }
}
