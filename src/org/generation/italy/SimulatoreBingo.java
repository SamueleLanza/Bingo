package org.generation.italy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class SimulatoreBingo {

	public static void main(String[] args) {

		ArrayList<Integer> schedaUtente = new ArrayList<Integer>();
		Random random = new Random();
		ArrayList<Integer> numeriEstratti = new ArrayList<Integer>();
		HashSet<Integer> numeriUguali = new HashSet<Integer>();

		// Genero i numeri del tabellone
		while (numeriEstratti.size() < 15) {
			int numeriRandom = random.nextInt(90);
			numeriEstratti.add(numeriRandom);

		}
		System.out.println("I numeri estratti sono: " + numeriEstratti);
		// genero i numeri della scheda del giocatore
		while (schedaUtente.size() < 15) {
			int numeroRandom = 1 + random.nextInt(90);
			if (!schedaUtente.contains(numeroRandom)) {
				schedaUtente.add(numeroRandom);
			}

		}
		System.out.println("I tuoi numeri: " + schedaUtente);

		// check se il numero estratto è sulla scheda del giocatore
		for (Integer numeroInteger : numeriEstratti) {

			if (schedaUtente.contains(numeriEstratti)) {
				numeriUguali.addAll(numeriEstratti);
			}
		}

		// Verifica "cinquina" o "Bingo"
		if (numeriUguali.size() == 15) {
			System.out.println("Hai fatto Bingo! :D");
		} else if (numeriUguali.size() >= 5) {
			System.out.println("Hai fatto cinquina");

		} else {
			System.out.println("Riprova :c");
		}
	}
}
