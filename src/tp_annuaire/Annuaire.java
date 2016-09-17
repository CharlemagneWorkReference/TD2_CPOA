package tp_annuaire;

import java.util.HashMap;
import java.util.Set;

/**
 * @author cyprien
 */
public class Annuaire extends HashMap<String,String>{
	
	/**
	 * Contructeur vide
	 */
	public Annuaire(){}
	
	/**
	 * Méthode qui affiche toutes les clés de
	 * l'annuaire
	 */
	public void domaine() {
		Set<String> dom = this.keySet();
		for (String s : dom)
			System.out.println(s);
	}
	
	/**
	 * Méthode qui retourne le numéro au nom associé
	 * @param nom String
	 * @return String
	 */
	public String acces(String nom) {
		if (this.containsKey(nom))
			return this.get(nom);
		return null;
	}

	/**
	 * Méthode qui insère un couple nom/numéro dans
	 * l'annuaire
	 * @param nom String
	 * @param num String
	 */
	public void adjonction(String nom, String num) {
		if (!this.containsKey(nom))
			this.put(nom, num);
	}
	
	/**
	 * Méthode qui supprime une entrée de l'annuaire
	 * @param nom String
	 */
	public void suppression(String nom) {
		if(this.containsKey(nom))
			this.remove(nom);
	}
	
	/**
	 * Méthode qui modifie une entrée de l'annuaire
	 * @param nom String
	 * @param num String
	 */
	public void changement(String nom, String num) {
		if(this.containsKey(nom)) {
			this.remove(nom);
			this.put(nom, num);
		}
	}
}
