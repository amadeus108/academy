package com.newlecture.web.academy.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Academy {
	@Id
	private String id;
	private String name;
	private String logo;
	private String address;
	
	//@Transient //이 컬럼은 DB에 없어. 나 혼자 쓰는거야. 무시해
	@OneToMany(mappedBy="academyId", fetch=FetchType.EAGER)//FetchType.EAGER = 페이지를 동시에 사용하는 경우 
	private List<MainMenu> mainMenus;
	
	public Academy() {
		
	}

	public Academy(String id, String name, String logo, String address) {
		this.id = id;
		this.name = name;
		this.logo = logo;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<MainMenu> getMainMenus() {
		return mainMenus;
	}

	public void setMainMenus(List<MainMenu> mainMenus) {
		this.mainMenus = mainMenus;
	}
	
	@Override
	public String toString() {
		return "Academy [id=" + id + ", name=" + name + ", logo=" + logo + ", address=" + address + "]";
	}	

}
