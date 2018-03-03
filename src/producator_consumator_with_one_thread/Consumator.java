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
public class Consumator extends Thread 
{
    private Produs copieProdus;
    public int lungimeaCozii;
    public Consumator(Produs produs, int size){
    copieProdus=produs;
    lungimeaCozii = size;
    }
    public void run(){
        for(int i=0;i<20;i++){
        copieProdus.get(); //incearca sa "consume" 20 produse
        try{
        sleep(500);
        }
        catch(Exception ex){
        System.out.println("Exceptie Consumator");
        }
    }
 }
}