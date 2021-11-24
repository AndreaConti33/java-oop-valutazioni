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

	String valutazione() {
		String valutazione = "";
		if (assenze > 50) {
			valutazione = "� bocciato";
		} else if (assenze <= 50 && assenze >= 25 && mediaVoti > 2) {
			valutazione = "� promosso";
		} else if (assenze < 25 && mediaVoti >= 2) {
			valutazione = "� promosso";
		} else {
			valutazione = "� bocciato";
		}
		return valutazione;

	}

}
