package com.project.professor.allocation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(length = 14, unique = true, nullable = false)
	private String cpf;
	
	@Column(name = "departmentId", nullable = false)
	private Long departmentId;
	
    @ManyToOne(optional = false)
    @JoinColumn(name = "departmentId", updatable = false, insertable = false, nullable = false)
	private Department dep;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

}
