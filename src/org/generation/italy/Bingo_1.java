package org.generation.italy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Bingo_1 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		HashSet<Integer> numeriEstratti = new HashSet<Integer>();
		ArrayList<Integer> schedaUtente = new ArrayList<Integer>(); //Le prime 5 posizioni sono la prima riga, le successive 5 la seconda, ecc...
		Random r=new Random();
		int n;
		
		do {
			n=r.nextInt(90)+1;   //casuale da 1 a 90
			if (!schedaUtente.contains(n))
				schedaUtente.add(n);    //se il numero non è contenuto nella scheda lo aggiungo
		} while (schedaUtente.size()<15); //torno indietro se nella scheda ci sono meno di 15 numeri
		
		
		
		//stampo la scheda su tre righe
		for (int i=0;i<schedaUtente.size();i++) {
			System.out.print(schedaUtente.get(i)+" ");
			if(i==4 || i==9)
				System.out.println();
		}
		
		//estrazione dei numeri del tabellone
		do {
			n=r.nextInt(90)+1;   //casuale da 1 a 90
			if (!numeriEstratti.contains(n)) {
				numeriEstratti.add(n);    //se il numero non è contenuto nella scheda lo aggiungo
				System.out.println("Numero Estratto: "+n);
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
				//stampo la scheda su tre righe
				for (int i=0;i<schedaUtente.size();i++) {
					if(numeriEstratti.contains(schedaUtente.get(i)))  //se il numero è presente nella scheda lo evidenzio 
						System.out.print(schedaUtente.get(i)+"* ");  
					else
						System.out.print(schedaUtente.get(i)+"  ");    //se il numero non è presente nella scheda lo stampo normalmente
					if(i==4 || i==9)
						System.out.println();
				} 
				
				System.out.println();
				System.out.println("Premi invio per continuare ...");
				sc.nextLine();
				
				
			}
			
			
		} while (numeriEstratti.size()<90);
		
		
	}

}
