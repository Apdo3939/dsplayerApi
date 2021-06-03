package com.apdo3939.dsplayer.dtos;

import com.apdo3939.dsplayer.entities.Player;

public class PlayerDTO {

	private Long id;
	private String title;
	private String albumName;
	private Boolean isLike;
	private String coverUrl;
	private String musicUrl;

	public PlayerDTO() {
		// TODO Auto-generated constructor stub
	}

	public PlayerDTO(Long id, String title, String albumName, Boolean isLike, String coverUrl, String musicUrl) {
		super();
		this.id = id;
		this.title = title;
		this.albumName = albumName;
		this.isLike = isLike;
		this.coverUrl = coverUrl;
		this.musicUrl = musicUrl;
	}

	public PlayerDTO(Player player) {
		id = player.getId();
		title = player.getTitle();
		albumName = player.getAlbumName();
		isLike = player.getLike();
		coverUrl = player.getCoverUrl();
		musicUrl = player.getMusicUrl();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public Boolean getIsLike() {
		return isLike;
	}

	public void setIsLike(Boolean isLike) {
		this.isLike = isLike;
	}

	public String getCoverUrl() {
		return coverUrl;
	}

	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}

	public String getMusicUrl() {
		return musicUrl;
	}

	public void setMusicUrl(String musicUrl) {
		this.musicUrl = musicUrl;
	}

}
