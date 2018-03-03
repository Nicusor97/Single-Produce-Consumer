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
public class Produs {
 private boolean available=false;
 private int container=-1;
 public synchronized void set(int valoare){
  
	 while(available==true){
   try{
    wait(5000); //blocheaza firul solicitant daca avem deja creat un obiect
   }
   catch(Exception ex){
    System.out.println("Eroare set");
   }
  }
  available=true;//pentru ca, consumatorul sa poata consuma
  container=valoare;
  System.out.println("Setare produs: "+container);
  notifyAll();//deblocheaza toate firele, in cazul de fata ofera o sansa consumatorului
 }
 public synchronized int get(){
  while(available==false){
   try{
    wait(5000);//blocheaza firul solicitant daca nu avem creat un obiect
    //Thread.sleep(50);
   }
   catch(Exception ex){
    System.out.println("Eroare get");
   }
  }
  available=false;//pentru ca, producatorul sa poata sa produca 
  System.out.println("Consumare produs: "+container);
  notifyAll();//deblocheaza toate firele, in cazul de fata ofera o sansa producatorului
  return container;
 }
}
