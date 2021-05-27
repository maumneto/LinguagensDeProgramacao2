/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploTemplateMethod;

/**
 *
 * @author mauricio.moreira
 */
public abstract class Compilador {
    public Compilador() {}
    public void MetodoTemplate() {
        codigoFonte();
        compilarParaObjeto();
        executar();
    }
    public abstract void codigoFonte();
    public abstract void compilarParaObjeto();
    public abstract void executar();
}
