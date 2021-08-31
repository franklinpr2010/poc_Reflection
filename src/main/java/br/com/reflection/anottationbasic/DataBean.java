package br.com.reflection.anottationbasic;

import java.util.List;

public class DataBean {
	@DataField
	private String name;
	@DataField
	private String data;
	private String description;
	private List<Teste> testes;

	  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Teste> getTestes() {
		return testes;
	}

	public void setTestes(List<Teste> testes) {
		this.testes = testes;
	}





	}
