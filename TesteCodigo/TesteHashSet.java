/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteCodigo;

import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author mauricio.moreira
 */
class BrazilStates {
    public String name;
    public String uf;
    public int id;

    public BrazilStates(String name, String uf, int id) {
        this.name = name;
        this.uf = uf;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getUF() {
        return uf;
    }
    public int getId() {
        return id;
    }
}


public class TesteHashSet {
    public static void main(String[] args) {
        Set<BrazilStates> states = new HashSet<>();
        
        BrazilStates ce = new BrazilStates("Ceará", "ce", 1);
        BrazilStates pe = new BrazilStates("Pernambuco", "pe", 2);
        BrazilStates sp = new BrazilStates("São Paulo", "sp", 3);
        BrazilStates rj = new BrazilStates("Rio de Janeiro", "rj", 4);
        BrazilStates pi = new BrazilStates("Piauí", "pi", 5);
        states.add(ce);
        states.add(pe);
        states.add(sp);
        states.add(rj);
        states.add(pi);

        for (BrazilStates state: states) {
            System.out.print(state.getId() + " ");
            System.out.print(state.getName() + " ");
            System.out.print(state.getUF());
            System.out.println("");
        }
    }
}
