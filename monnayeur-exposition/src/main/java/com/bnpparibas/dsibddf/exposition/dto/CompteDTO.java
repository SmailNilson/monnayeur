/**
 * 
 */
package com.bnpparibas.dsibddf.exposition.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ADMINIBM
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "TableauComptes")
public class CompteDTO {
	/**
	 * numéro du compte
	 */
	@XmlElement(name = "NumeroCompte", required = true)
	private String numeroCompte;

	/**
	 * libellé type de compte
	 */
	@XmlElement(name = "libelleType2Compte", required = true)
	private String libelleType2Compte;

	/**
	 * Solde du compte
	 */
	@XmlElement(name = "SoldeCompte", required = true)
	private double soldeCompte;

	/**
	 * Plafond du compte
	 */
	@XmlElement(name = "PlafondCompte", required = true)
	private double plafondCompte;

	/**
	 * montant depot minimal
	 */
	@XmlElement(name = "MontantDepotMinimal", required = true)
	private int montantDepotMinimal;

	/**
	 * libellé code devise compte
	 */
	@XmlElement(name = "LibelleCodeDeviseCompte", required = true)
	private String libelleCodeDevise;

	/**
	 * @return the numeroCompte
	 */
	public String getNumeroCompte() {
		return numeroCompte;
	}

	/**
	 * @param numeroCompte
	 *            the numeroCompte to set
	 */
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	/**
	 * @return the libelleType2Compte
	 */
	public String getLibelleType2Compte() {
		return libelleType2Compte;
	}

	/**
	 * @param libelleType2Compte
	 *            the libelleType2Compte to set
	 */
	public void setLibelleType2Compte(String libelleType2Compte) {
		this.libelleType2Compte = libelleType2Compte;
	}

	/**
	 * @return the soldeCompte
	 */
	public double getSoldeCompte() {
		return soldeCompte;
	}

	/**
	 * @param soldeCompte
	 *            the soldeCompte to set
	 */
	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	/**
	 * @return the plafondCompte
	 */
	public double getPlafondCompte() {
		return plafondCompte;
	}

	/**
	 * @param plafondCompte
	 *            the plafondCompte to set
	 */
	public void setPlafondCompte(double plafondCompte) {
		this.plafondCompte = plafondCompte;
	}

	/**
	 * @return the montantDepotMinimal
	 */
	public int getMontantDepotMinimal() {
		return montantDepotMinimal;
	}

	/**
	 * @param montantDepotMinimal
	 *            the montantDepotMinimal to set
	 */
	public void setMontantDepotMinimal(int montantDepotMinimal) {
		this.montantDepotMinimal = montantDepotMinimal;
	}

	/**
	 * @return the libelleCodeDevise
	 */
	public String getLibelleCodeDevise() {
		return libelleCodeDevise;
	}

	/**
	 * @param libelleCodeDevise
	 *            the libelleCodeDevise to set
	 */
	public void setLibelleCodeDevise(String libelleCodeDevise) {
		this.libelleCodeDevise = libelleCodeDevise;
	}

}
