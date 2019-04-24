/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

/**
 *
 * @author aparcerozas
 */
public class Boletin30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SeleccionFutbol f1 = new Futbolista(7,"Delantero",127,"Leo","Messi",35);
        f1.viajar();
        f1.jugarPartido();
        System.out.println(f1.toString());
        SeleccionFutbol s1 = new Seleccionador(21,"Jorge","Valverde",58);
        s1.concentrarse();
        System.out.println(s1.toString());
        Entrenador e1 = new Entrenador();
        e1.planificarEntrenamiento();
        Futbolista j2 = new Futbolista();
        j2.entrevista();
    }
    
}
