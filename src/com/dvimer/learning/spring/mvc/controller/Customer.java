package com.dvimer.learning.spring.mvc.controller;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer
{
	@NotNull()
	private String firstName;
	@NotNull()
	@Size(min = 5, message = "is requared")
	private String lastName;


	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	@Override
	public String toString()
	{
		final StringBuilder sb = new StringBuilder("Customer{");
		sb.append("firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
