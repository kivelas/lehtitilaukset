
// Saila Kivela

public class StandingSubscription extends Subscription {
	
	private int alennusprosentti;
	
	public StandingSubscription(String lehden_nimi, String tilaajan_nimi, String toimitusosoite, int alennusprosentti) {
		super(lehden_nimi, tilaajan_nimi, toimitusosoite);
		this.alennusprosentti = alennusprosentti;
	}
	
	public void setAlennusprosentti(int alennusprosentti) {
		this.alennusprosentti = alennusprosentti;
	}
	
	public int getAlennusprosentti() {
		return this.alennusprosentti;
	}
	
	public void printInvoice() {
		double tilauksenHinta = 12 * getKuukausihinta() * (1.00 -(this.alennusprosentti / 100.00));
		System.out.println("Kestotilaus\ntilaajan tiedot: \n" + getTilaajan_nimi() + "\n" + getToimitusosoite() + "\n\nlaskutustiedot: \n" + getLehden_nimi() + "\nlaskutus vuoden (12 kk) jaksoissa\nmaksettava summa: " + tilauksenHinta + " e\n");
	}
	
	public String toString() {
		return "\ntilauksen alennusprosentti: " + this.alennusprosentti;
	}
}
