package com.angularapi.pestservapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Data @NoArgsConstructor @AllArgsConstructor 
@Entity
@Table(name="membre")
public class Membre  implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long membre_id;
	@Column(length=40)
	private String Nom;
	@Column(length=40)
	private String Prenom;
	@Column(length=30)
	private String telephone;
	@ManyToOne
	@JoinColumn(name="id_service")
	private GService serviice;
	   @ManyToMany(mappedBy = "membres")
	    private Set<Projet> projets = new HashSet<>();
}
