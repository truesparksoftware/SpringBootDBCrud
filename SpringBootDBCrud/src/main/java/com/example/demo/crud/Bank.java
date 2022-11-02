package com.example.demo.crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name="BankRecord")
public class Bank {
	@Id
	private String id;
	private String name;
	private String loc;
}
