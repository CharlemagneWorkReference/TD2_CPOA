package test;

import static org.junit.Assert.*;

import org.junit.Test;

import tp_annuaire.Annuaire;

/**
 * Classe de tests de l'annuaire
 * @author cyprien
 *
 */
public class AnnuaireTest {

	@Test
	public void testAcces() {
		Annuaire an = new Annuaire();
		an.adjonction("Jean", "12345");
		assertEquals("Devrait retourner 12345","12345",an.acces("Jean"));
	}

	@Test
	public void testAdj() {
		Annuaire an = new Annuaire();
		an.adjonction("Jean", "12345");
		assertEquals("La taille devrait être de 1",1,an.size());
	}
	
	@Test
	public void testSuppr() {
		Annuaire an = new Annuaire();
		an.adjonction("Jean", "12345");
		an.suppression("Jean");
		assertEquals("La taille devrait être de 0",0,an.size());
	}
	
	@Test
	public void testChange() {
		Annuaire an = new Annuaire();
		an.adjonction("Jean", "12345");
		an.changement("Jean", "54321");
		assertEquals("Devrait retourner 54321","54321",an.acces("Jean"));
	}
}
