
// Saila Kivela
// Olio-ohjelmointi -kurssin harjoitustehtava 3.
// Lehtitilausten kirjaaminen ja tilauslaskujen tulostaminen.

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class VT3main {

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		boolean ok = false;
		
		try {
			System.out.println("Anna normaalitilauksen tiedot");
			System.out.println("Anna tilattavan lehden nimi: ");
			String lehti = lukija.nextLine();
		
			System.out.println("Anna tilaajan koko nimi: ");
			String tilaaja = lukija.nextLine();
		
			System.out.println("Anna toimitusosoite: ");
			String toimitusosoite = lukija.nextLine();		
				
			System.out.println("Annan tilauksen kesto kokonaisissa kuukausissa: ");
			int kesto = Integer.parseInt(lukija.nextLine());
				if (kesto < 0) {
					System.out.println("Kesto ei voi olla negatiivinen luku.");
				} else {
			
					System.out.println("Anna kestotilauksen tiedot");
					System.out.println("Anna tilattavan lehden nimi: ");
					String lehtiKesto = lukija.nextLine();
		
					System.out.println("Anna tilaajan koko nimi: ");
					String tilaajaKesto = lukija.nextLine();
		
					System.out.println("Anna toimitusosoite: ");
					String toimitusosoiteKesto = lukija.nextLine();
				
					System.out.println("Anna alennusprosentti kokonaislukuna: ");
					int alennusprosentti = Integer.parseInt(lukija.nextLine());
					
					if (alennusprosentti < 0) {
						System.out.println("Alennusprosentti ei voi olla negatiivinen.");
					} else {
			
						Subscription [] subs = new Subscription[2];
						subs[0] = new RegularSubscription(lehti, tilaaja, toimitusosoite, kesto);
						subs[1] = new StandingSubscription(lehtiKesto, tilaajaKesto, toimitusosoiteKesto, alennusprosentti);
			
						printSubscriptionInvoice(subs);
			
						ok = true;
					}
				}
			
		}catch (NumberFormatException nfe) {
			System.out.println("Virhe syotteessa.");
			System.out.println(nfe.toString());
		}	
	}

	public static void printSubscriptionInvoice(Subscription [] subs) {	
		for (int i = 0; i < subs.length; i++) {
			subs[i].printInvoice();
		}
	}
}
