package com.example.firstdemo.dto;

public class BookDTO {

	private long idx;
	private String title;
	private String author;
	private String publisher;
	private int publishdate;
	
	public BookDTO() {}
	
	public BookDTO(long idx, String title, String author, String publisher, int publishdate) {
		super();
		this.idx = idx;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishdate = publishdate;
	}
	
	public long getIdx() {
		return idx;
	}
	public void setIdx(long idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPublishdate() {
		return publishdate;
	}
	public void setPublishdate(int publishdate) {
		this.publishdate = publishdate;
	}

	@Override
	public String toString() {
		return "BookDTO [idx=" + idx + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", publishdate=" + publishdate + "]";
	}
	
	
}
