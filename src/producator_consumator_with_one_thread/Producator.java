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
public class Producator extends Thread{
    private Produs copieProdus;
    public int lungimeacozii;
    public Producator(Produs produs, int lungime)
    {
        copieProdus = produs;
        lungimeacozii = lungime;
    }
    
    public void run()
    {
        for (int i=0; i<lungimeacozii; i++)
        {
            copieProdus.set(i);
            try
            {
                sleep(500);
            }
            catch(Exception ex)
            {
                System.out.println("Exceptie producator");
            }
        }
    }
}
