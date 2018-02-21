package com.dockertp.dockertpmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dockertp.dockertpmongo.document.Formation;

public interface FormationRepository extends MongoRepository<Formation, Integer> {
	public Formation findById(int Id);
	public List<Formation> findByNomFormation(String nomformation);
	public List<Formation> findByNbStagiairesMax(int nbStagiairesMax);
	
	// Get
	public List<Formation> findAll();
	
	// Post
	public Formation save(Formation saved);
}
