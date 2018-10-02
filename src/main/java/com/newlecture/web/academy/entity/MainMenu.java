package com.newlecture.web.academy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class MainMenu {

	/*
	 	update MainMenu
	 	set id = ?
	 		title = ?
	 		url = ?
	 		academyId = ?
	 * */
	@Id
	@GeneratedValue (
		strategy=GenerationType.AUTO
		,generator="native" /*dbms의 자동증가 방식으로 설정하겠다=native, hibernate가 자동증가 시킨후에 db에 입력해줘라*/
	)/*mysql의 경우 default값이 자동으로 입력된다*/
	@GenericGenerator(
		name="native"
		,strategy="native"
	)
	private int id;
	private String title;
	private String url;
	@Column(updatable=false, insertable=false)	//update할때 넣지 않아도 되는 값으로 설정
	private String academyId;
	@Column(updatable=false)	//update할때 넣지 않아도 되는 값으로 설정
	private Integer parentId; //null이 들어갈수 있는 entity는 문자열이 들어갈 수 있는 정수형으로 바꿔줘야한다.
	@Column(insertable=false, name="[order]")
	private int order;
	
	@ManyToOne
	@JoinColumn(name="academyId")//insert, update 등 처리할때 이 academy에 있는 컬럼을 사용함
	private Academy academy;
	
	public MainMenu() {
		
	}
	
	//for updating
	public MainMenu(int id, String title, String url) {
		this.id = id;
		this.title = title;
		this.url = url;
	}
	
	public MainMenu(String title, String url, String academyId) {
		this.title = title;
		this.url = url;
		this.academyId = academyId;
	}

	public MainMenu(int id, String title, String url, String academyId, Integer parentId, int order) {
		this.id = id;
		this.title = title;
		this.url = url;
		this.academyId = academyId;
		this.parentId = parentId;
		this.order = order;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAcademyId() {
		return academy.getId();
		//Academy Entity와 연결했기 때문에 MainMenu의 academyId를 이용하지않고 Academy의 Id를 사용하도록 설정
	}

	public void setAcademyId(String academyId) {
		this.academy.setId(academyId);
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	

	@Override
	public String toString() {
		return "MainMenu [id=" + id + ", title=" + title + ", url=" + url + ", academyId=" + academyId + ", parentId="
				+ parentId + ", order=" + order + "]";
	}

	public Academy getAcademy() {
		return academy;
	}

	public void setAcademy(Academy academy) {
		this.academy = academy;
	}

	
}
