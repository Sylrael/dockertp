package com.dockertp.dockertpmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dockertp.dockertpmongo.document.Formation;
import com.dockertp.dockertpmongo.repository.FormationRepository;

@RestController
//@RequestMapping("/formations")
public class ApiController {
	
	@Autowired 
	private FormationRepository formationRepo;
	
	@RequestMapping(value="/formations", method = RequestMethod.GET)
	public List<Formation> listerexemples() {
		return this.formationRepo.findAll();
	}
	
	@RequestMapping(value="/formations", method = RequestMethod.POST)
	public void addFormation(@RequestBody Formation formation) {
		formationRepo.save(formation);
	}
}