import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/*
 * CotxeHashSet.java        1.0 02/10/2015
 *
 * class CotxeHashSet
 *
 * Copyright 2015 Jordi Llonch Neira <jordill14@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class CotxeHashSet {
	public static void main(String[] args) {
		//Creem el hasSet de 5 objectes
		HashSet<Cotxe> hashCotxes = new HashSet<Cotxe>(5);
		//Creem els 5 objectes 
		Cotxe cAlfa = new Cotxe("Alfa Romeo", "Giulia", 2900, 6);
		Cotxe cDacia = new Cotxe("Dacia", "Sandero", 1200, 4);
		Cotxe cFord = new Cotxe("Ford", "Focus", 2000, 4);
		Cotxe cOpel = new Cotxe("Opel", "Insignia", 2200, 4);
		Cotxe cIbiza = new Cotxe("Seat", "Ibiza", 1600, 4);
		//Omplim el hashSet amb els objectes
		hashCotxes.add(cAlfa);
		hashCotxes.add(cDacia);
		hashCotxes.add(cFord);
		hashCotxes.add(cOpel);
		hashCotxes.add(cIbiza);
		//Imprimim
		for ( Cotxe car : hashCotxes){
			System.out.println(car.toString());
		}
		
		
		//trobem la potenciaFiscal de cotxe Dacia
		if(hashCotxes.contains(cDacia)){
			System.out.println("\nLa potencia fiscal del Dacia Sandero és: " + cDacia.getpFiscal() + "\n");   
		}
		//Afegim dos objectes més
		Cotxe cHyundai = new Cotxe("Hyundai", "Atos", 1500, 3);
		Cotxe cFord2 = new Cotxe("Ford", "Focus", 2000, 4);
		hashCotxes.add(cHyundai);
		hashCotxes.add(cFord2);
		//Imprimim
		for ( Cotxe car : hashCotxes){
			System.out.println(car.toString());
		}
		
		//Provem si es pot duplicar
		Cotxe cAlfa2 = new Cotxe("Alfa Romeo", "Giulia", 2900, 6);
		hashCotxes.add(cAlfa2);
		
		if(hashCotxes.add(cAlfa2)){
			System.out.println("\nL'objecte ha estat insertat\n");
		} else {
			System.out.println("\nL'objecte no ha estat insertat, llavors no es pot duplicar un objecte!\n");
		}
		
		//No es pot inserir a la primera posició(no hi ha mètode), inserta aleatoriament
		Cotxe cAudi = new Cotxe("Audi", "A8", 4600, 8);
		hashCotxes.add(cAudi);
		
		//
		Cotxe cMii = new Cotxe("Seat", "Mii", 1000, 3);
		if(hashCotxes.contains(cIbiza)){
			hashCotxes.remove(cIbiza);
			hashCotxes.add(cMii);
		}
		//Imprimim
		for ( Cotxe car : hashCotxes){
			System.out.println(car.toString());
		}
	}
}

