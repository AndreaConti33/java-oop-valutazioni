package org.generation.italy.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		CalcolaValutazione[] studenti = new CalcolaValutazione[20];
		Random rd = new Random();

		int idStudente = 0;
		int assenze = 0;
		double mediaVoti = 0.0;

		for (int i = 0; i < studenti.length; i++) {
			idStudente++;
			assenze = rd.nextInt(101);
			mediaVoti = rd.nextInt(6);

			studenti[i] = new CalcolaValutazione(idStudente, assenze, mediaVoti);

			System.out.println(" Lo studente con numero di id: " + idStudente + " " + studenti[i].valutazione());

		}

	}

}
