/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploMVC.Controller;

import ExemploMVC.Model.CalculadoraModel;
import ExemploMVC.View.CalculadoraView;
/**
 *
 * @author mauricio.moreira
 */
public class CalculadoraController {
    private CalculadoraView view;

    public CalculadoraController(CalculadoraView view) {
        this.view = view;
    }

    public void calcular() {
        CalculadoraModel model = new CalculadoraModel();
        
        switch (view.getOperacao()) {
            case 1 : {
                double resultado = model.somar(view.getN1(), view.getN2());
                view.saida(resultado);
                break;
            }
            case 2 : {
                double resultado = model.subtrair(view.getN1(), view.getN2());
                view.saida(resultado);
                break;
            }
            case 3 : {
                double resultado = model.multiplicar(view.getN1(), view.getN2());
                view.saida(resultado);
                break;
            }
            case 4 : {
                double resultado = model.dividir(view.getN1(), view.getN2());
                if (resultado == -1) {
                    System.out.println("Não existe divisão por zero!");
                     view.saida(resultado);
                } else {
                     view.saida(resultado);
                }
                break;
            }
        }
    }
}
