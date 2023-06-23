package com.springcore.springlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationUsing {
	
 private String books;

public String getBooks() {
	return books;
}

public void setBooks(String books) {
	this.books = books;
}

@Override
public String toString() {
	return "AnnotationUsing [books=" + books + "]";
}
 @PostConstruct
 public void statrt() {
	 System.out.println("staring method");
 }@PreDestroy
 public void end() {
	 System.out.println("ending method");
 }
	
}
