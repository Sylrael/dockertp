package com.dockertp.dockertpmongo.document;

import org.springframework.data.annotation.Id;

public class Formation {
	
	@Id
	private int id;
	
	private String nomFormation;
	private int nbStagiairesMax;
	
	public Formation() {}

	public Formation(String nomFormation, int nbStagiairesMax) {
		this.nomFormation = nomFormation;
		this.nbStagiairesMax = nbStagiairesMax;
	}
	
	public Formation(int id, String nomFormation, int nbStagiairesMax) {
		this.id = id;
		this.nomFormation = nomFormation;
		this.nbStagiairesMax = nbStagiairesMax;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomFormation() {
		return nomFormation;
	}

	public void setNomFormation(String nomFormation) {
		this.nomFormation = nomFormation;
	}

	public int getNbStagiairesMax() {
		return nbStagiairesMax;
	}

	public void setNbStagiairesMax(int nbStagiairesMax) {
		this.nbStagiairesMax = nbStagiairesMax;
	}

	@Override
	public String toString() {
		return "Formation [id=" + id + ", nomFormation=" + nomFormation + ", nbStagiairesMax=" + nbStagiairesMax + "]";
	}
	
	
	
	
}
