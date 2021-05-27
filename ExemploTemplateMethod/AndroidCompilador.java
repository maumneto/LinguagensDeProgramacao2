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
public class AndroidCompilador extends Compilador {
    @Override
    public void codigoFonte() {
        System.out.println("Capturando o código fonte Java!");
    }
    @Override
    public void compilarParaObjeto(){
        System.out.println("Compilando para a arquitetura alvo!");
    }
    @Override
    public void executar() {
        System.out.println("Executando a aplicação Java!");
    }
}
