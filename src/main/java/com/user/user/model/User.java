package com.user.user.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "user")
public class User {
	@Id
	private int userId;
	private String firstName;
	private String lastName;
	private String username;

}
