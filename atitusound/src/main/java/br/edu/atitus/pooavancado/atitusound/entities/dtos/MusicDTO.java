package br.edu.atitus.pooavancado.atitusound.entities.dtos;

import java.time.Duration;


public class MusicDTO {
	
	private String name;
	private String url;
	private Duration duration;
	private DTOOnlyUUID artist;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	public DTOOnlyUUID getArtist() {
		return artist;
	}
	public void setArtist(DTOOnlyUUID artist) {
		this.artist = artist;
	}
	
}
