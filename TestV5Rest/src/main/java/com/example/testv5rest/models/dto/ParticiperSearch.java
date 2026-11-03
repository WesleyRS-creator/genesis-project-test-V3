package com.example.testv5rest.models.dto;

import lombok.Getter;
import lombok.Setter;
import com.example.testv5rest.models.Personne;

import com.example.testv5rest.models.Projet;



@Getter @Setter
public class ParticiperSearch {

	private Integer id;

	private Personne idpersonnePersonne;
	
	private Projet idprojetProjet;
	
	private java.time.LocalDateTime dateInscription;
	private java.time.LocalDateTime dateInscriptionMin;
	private java.time.LocalDateTime dateInscriptionMax;

	private String roleDansProjet;
	
}
