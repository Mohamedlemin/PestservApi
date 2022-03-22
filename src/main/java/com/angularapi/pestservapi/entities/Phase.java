package com.angularapi.pestservapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Data @NoArgsConstructor @AllArgsConstructor 
@Entity
@Table(name="phase")
public class Phase implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length=50)
	private String description;
	@Column(length=30)
	private String nom;
	@Column(length=30)
	private String status;
	@Column(length=30)
	private String delais;
	private Date date_debut;
	
	private double budget;
	@ManyToOne
	@JoinColumn(name="id_projet")
	private Projet projet;


}
