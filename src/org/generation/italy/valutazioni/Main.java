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
			mediaVoti = rd.nextDouble() * 5.0;

			studenti[i] = new CalcolaValutazione(idStudente, assenze, mediaVoti);

			if (studenti[i].valutazione() == true) {
				System.out.println("Lo studente con id " + idStudente + " è promosso, " + "con una media voti di "
						+ mediaVoti + " e " + assenze + " assenze");
			} else {
				System.out.println("Lo studente con id " + idStudente + " è bocciato, " + "con una media voti di "
						+ mediaVoti + " e " + assenze + " assenze");
			}

		}

	}

}
