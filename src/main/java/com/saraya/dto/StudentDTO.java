package com.saraya.dto;

import java.util.Date;

import com.saraya.model.Student;

public class StudentDTO {
	private Date date_de_naissance;
	private String prenom_nom;
	
	private String adresse;
	
	private String regime;
	
	private Long telephone;
	
	private int frais_inscription;
	
	private int mensualite;
	
	private Date date_inscription;

	
	public StudentDTO() {
		super();
	}

	public StudentDTO(Date date_de_naissance, String prenom_nom, String adresse, String regime, Long telephone,
			int frais_inscription, int mensualite, Date date_inscription) {
		super();
		this.date_de_naissance = date_de_naissance;
		this.prenom_nom = prenom_nom;
		this.adresse = adresse;
		this.regime = regime;
		this.telephone = telephone;
		this.frais_inscription = frais_inscription;
		this.mensualite = mensualite;
		this.date_inscription = date_inscription;
	}

	public StudentDTO(Date date_de_naissance, String prenom_nom, String regime, Date date_inscription) {
		super();
		this.date_de_naissance = date_de_naissance;
		this.prenom_nom = prenom_nom;
		this.regime = regime;
		this.date_inscription = date_inscription;
	}

	/**
	 * @return the date_de_naissance
	 */
	public Date getDate_de_naissance() {
		return date_de_naissance;
	}

	/**
	 * @param date_de_naissance the date_de_naissance to set
	 */
	public void setDate_de_naissance(Date date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}

	/**
	 * @return the prenom_nom
	 */
	public String getPrenom_nom() {
		return prenom_nom;
	}

	/**
	 * @param prenom_nom the prenom_nom to set
	 */
	public void setPrenom_nom(String prenom_nom) {
		this.prenom_nom = prenom_nom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the regime
	 */
	public String getRegime() {
		return regime;
	}

	/**
	 * @param regime the regime to set
	 */
	public void setRegime(String regime) {
		this.regime = regime;
	}

	/**
	 * @return the telephone
	 */
	public Long getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the frais_inscription
	 */
	public int getFrais_inscription() {
		return frais_inscription;
	}

	/**
	 * @param frais_inscription the frais_inscription to set
	 */
	public void setFrais_inscription(int frais_inscription) {
		this.frais_inscription = frais_inscription;
	}

	/**
	 * @return the mensualite
	 */
	public int getMensualite() {
		return mensualite;
	}

	/**
	 * @param mensualite the mensualite to set
	 */
	public void setMensualite(int mensualite) {
		this.mensualite = mensualite;
	}

	/**
	 * @return the date_inscription
	 */
	public Date getDate_inscription() {
		return date_inscription;
	}

	/**
	 * @param date_inscription the date_inscription to set
	 */
	public void setDate_inscription(Date date_inscription) {
		this.date_inscription = date_inscription;
	}

	@Override
	public String toString() {
		return "Student [date_de_naissance=" + date_de_naissance + ", prenom_nom=" + prenom_nom + ", adresse=" + adresse
				+ ", regime=" + regime + ", telephone=" + telephone + ", frais_inscription=" + frais_inscription
				+ ", mensualite=" + mensualite + ", date_inscription=" + date_inscription + "]";
	}
	
	public static Student prepareStudentEntity(StudentDTO student) {
		Student std=new Student();
		std.setDate_de_naissance(student.getDate_de_naissance());
		std.setPrenom_nom(student.getPrenom_nom());
		std.setAdresse(student.getAdresse());
		std.setDate_inscription(student.getDate_inscription());
		return std;
		
		
	}

}
