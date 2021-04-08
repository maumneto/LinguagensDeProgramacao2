/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula5.Exercicio2;

import java.util.Date;
/**
 *
 * @author mauricio.moreira
 */
public class Venda {
    private int codigo;
    public Date data;
    public Cliente cliente; 
    public Funcionario funcionario;
    
    public Venda(int codigo, Cliente cliente, Funcionario funcionario) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }
    public int getCodigo(){
        return codigo;
    }
//    public void setCliente(Cliente cliente) {
//        this.cliente = cliente;
//    }
}
