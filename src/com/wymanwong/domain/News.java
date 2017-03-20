package com.wymanwong.domain;

public class News extends BaseEntity {

	private static final long serialVersionUID = -477423593417382864L;

	private String title;
	private String content;
	private String fullContent;

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getFullContent() {
		return fullContent;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setFullContent(String fullContent) {
		this.fullContent = fullContent;
	}

	@Override
	public String toString() {
		return this.fullContent;
	}
}
