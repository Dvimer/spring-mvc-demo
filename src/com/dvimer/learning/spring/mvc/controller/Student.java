package com.dvimer.learning.spring.mvc.controller;

import java.util.LinkedHashMap;

public class Student
{
	private String firstName;
	private String lastName;
	private String country;
	private String language;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	public Student()
	{
		favoriteLanguageOptions = new LinkedHashMap<>();

		// parameter order: value, display label
		//
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("PHP", "PHP");
		favoriteLanguageOptions.put("Ruby", "Ruby");


	}

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


	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public String getLanguage()
	{
		return language;
	}

	public void setLanguage(String language)
	{
		this.language = language;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions()
	{
		return favoriteLanguageOptions;
	}

	public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions)
	{
		this.favoriteLanguageOptions = favoriteLanguageOptions;
	}

	@Override
	public String toString()
	{
		final StringBuilder sb = new StringBuilder("Student{");
		sb.append("firstName='").append(firstName).append('\'');
		sb.append(", lastName='").append(lastName).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
