package com.dockertp.dockertpmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dockertp.dockertpmongo.document.Formation;
import com.dockertp.dockertpmongo.repository.FormationRepository;

@SpringBootApplication
public class DockertpApplication{ //implements CommandLineRunner{

	@Autowired
	private FormationRepository formationRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(DockertpApplication.class, args);
	}
	
	/*@Override
	public void run(String[] args) throws Exception {
		//formationRepo.deleteAll();
		
		//Add des formations
		formationRepo.save(new Formation(1,"Formation Big Data",12));
		formationRepo.save(new Formation(2,"Formation Java", 10));
		formationRepo.save(new Formation(3,"Formation Java", 12));
		
		//Retrieve all formations
		for(Formation formation : formationRepo.findAll()) {
			System.out.println(formation);
		}
		System.out.println();
		
		//Find by nomFormation : "Java"
		for(Formation formation : formationRepo.findByNomFormation("Formation Java")) {
			System.out.println(formation);
		}
		
		System.out.println("End");
		
	}*/
}
