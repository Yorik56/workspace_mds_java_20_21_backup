package fr.mds.javaCourse.opdemo_2.model;

import java.util.Date;

public class Media {
	
	private String name;
	private Date releaseDate;
	
	public Media() {
		// TODO Auto-generated constructor stub
	}	
	public Media(String name, Date releaseDate) {
		this.name = name;
		this.releaseDate = releaseDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "this is a media " + this.name;
	}
	
	
}
