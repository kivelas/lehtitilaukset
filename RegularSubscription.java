
// Saila Kivela

public class RegularSubscription extends Subscription {

	private int tilauksen_kesto;
	
	public RegularSubscription(String lehden_nimi, String tilaajan_nimi, String toimitusosoite, int tilauksen_kesto) {
		super(lehden_nimi, tilaajan_nimi, toimitusosoite);
		this.tilauksen_kesto = tilauksen_kesto;
	}
	
	public void setTilauksen_kesto(int tilauksen_kesto) {
		this.tilauksen_kesto = tilauksen_kesto;
	}
	
	public int getTilauksen_kesto() {
		return this.tilauksen_kesto;
	}
	
	public void printInvoice() {
		double tilauksenHinta = tilauksen_kesto * getKuukausihinta();
		System.out.println("Tavallinen tilaus\ntilaaja: \n" + getTilaajan_nimi() + "\n" + getToimitusosoite() + "\n\nlaskutustiedot: \n" + getLehden_nimi() + "\ntilausjakson pituus: " + this.tilauksen_kesto + " kk\nmaksettava summa: " + tilauksenHinta + " e\n");
	}
	
	public String toString() {
		return super.toString() +  "\ntilauksen kesto: " + this.tilauksen_kesto;
	}
}
