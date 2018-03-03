/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producator_consumator_with_one_thread;

/**
 *
 * @author nicol
 */
public class Producator_consumator_with_one_thread {
    
 public static void main(String[] args){
    
    Produs produs=new Produs();
    Consumator consumator=new Consumator(produs, 20);
    Producator producator=new Producator(produs, 20);
    producator.start();
    consumator.start();
 }
}
