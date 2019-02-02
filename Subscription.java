
// Saila Kivela

public class Subscription {

	private String lehden_nimi;
	private String tilaajan_nimi;
	private String toimitusosoite;
	private double kuukausihinta;
	
	public Subscription(String lehden_nimi, String tilaajan_nimi, String toimitusosoite) {
		this.lehden_nimi = lehden_nimi;
		this.tilaajan_nimi = tilaajan_nimi;
		this.toimitusosoite = toimitusosoite;
		this.kuukausihinta = 10.00;
	}
	
	public void setLehden_nimi(String lehden_nimi) {
		this.lehden_nimi = lehden_nimi;
	}
	
	public String getLehden_nimi() {
		return this.lehden_nimi;
	}
	
	public void setTilaajan_nimi(String tilaajan_nimi) {
		this.tilaajan_nimi = tilaajan_nimi;
	}
	
	public String getTilaajan_nimi() {
		return this.tilaajan_nimi;
	}
	
	public void setToimitusosoite(String toimitusosoite) {
		this.toimitusosoite = toimitusosoite;
	}
	
	public String getToimitusosoite() {
		return this.toimitusosoite;
	}
	
	public void setKuukausihinta(double kuukausihinta) {
		this.kuukausihinta = kuukausihinta;
	}
	
	public double getKuukausihinta() {
		return this.kuukausihinta;
	}
	
	public void printInvoice() {
	}
	
	public String toString() {
		return "\nlehti: " + this.lehden_nimi + "\ntilaaja: " + this.tilaajan_nimi + "\ntoimitusosoite: " + this.toimitusosoite + "\nhinta: " + this.kuukausihinta + " e/kk";
	}
}
