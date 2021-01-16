package com.hw6.model.vo;

public class Book {
	private String title;
	private String author;
	private String publisher;
	
	public Book() {}
	public Book(String title, String author, String publisher) {
		this.title=title;
		this.author=author;
		this.publisher=publisher;
	}
	
	public String toString() {
		return "title : "+title+",author : "+ author+",publisher : "+publisher;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setAuthoer(String author) {
		this.author=author;
	}
	public void setPublisher(String publisher) {
		this.publisher=publisher;
	}
}