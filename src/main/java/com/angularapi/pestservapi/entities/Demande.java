package com.angularapi.pestservapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor 
@Entity
@Table(name="demande")
public class Demande implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="description",length=70)
	private String description;
	@Column(length=30)
	private String delais;
	@Column(length=30)
	private String status;
	private Date date_creation;
	@ManyToOne
	@JoinColumn(name="id_service")
	private GService service;
	
	
	@ManyToOne
	@JoinColumn(name="id_client")
	private Client client;
	@ManyToOne
	@JoinColumn(name="id_accueil")
	private Accueilleur accueil;
}
