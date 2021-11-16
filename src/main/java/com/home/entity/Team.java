package com.home.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@ToString
@Entity
@Table
public class Team implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Setter
	@Column(name="is_delete")
	private String isDelete;
	@Setter
	@Column(name="created_by")
	private String createdBy;
	@Setter
	@Column(name="created_date")
	private Date createdDate;
	@Setter
	@Column(name="updated_date")
	private Date updatedDate;
}
