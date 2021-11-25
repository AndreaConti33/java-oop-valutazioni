package org.generation.italy.valutazioni;

public class CalcolaValutazione {

	int idStudente;
	int assenze;
	double mediaVoti;

	CalcolaValutazione(int idStudente, int assenze, double mediaVoti) {
		this.idStudente = idStudente;
		this.assenze = assenze;
		this.mediaVoti = mediaVoti;
	}

	boolean valutazione() {
		boolean valutazione;
		if (assenze > 50) {
			valutazione = false;
		} else if (assenze <= 50 && assenze >= 25) {
			valutazione = mediaVoti > 2;
		} else if (assenze < 25) {
			valutazione = mediaVoti >= 2;
		} else {
			valutazione = false;
		}
		return valutazione;

	}

}
