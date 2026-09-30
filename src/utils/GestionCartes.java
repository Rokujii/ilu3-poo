package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class GestionCartes {

	public static <T> T extraire1(List<T> liste) {
		int indice = new Random().nextInt(liste.size());
		return liste.remove(indice);
	}
	
	public static <T> T extraire2(List<T> liste) {
		int position = new Random().nextInt(liste.size());
		ListIterator<T> iterator = liste.listIterator();
		T element = null;
		for (int i=0; i<position;i++) element = iterator.next();
		iterator.remove();
		return element;
	}
	
	public static <T> List<T> melanger(List<T> liste) {
		List<T> resultat = new ArrayList<T>();
		while(!liste.isEmpty()) {
			resultat.add(extraire2(liste));
		}
		return resultat;
		
	}
	
	public static <T> boolean verifierMelange(List<T> liste1, List<T> liste2) {
		if(liste1.size() != liste2.size()) return false;
		
		for (T element : liste1) {
			if (Collections.frequency(liste1, element) != Collections.frequency(liste2, element)) return false;
		}
		
		return true;
	}
	
	public static <T> List<T> rassembler(List<T> liste) {
		List<T> resultat = new ArrayList<T>();
		
		
		for (ListIterator<T> iterator = liste.listIterator(); iterator.hasNext();) {
			iterator.next();	
		}
		
		return resultat;
	}
	
	
}
