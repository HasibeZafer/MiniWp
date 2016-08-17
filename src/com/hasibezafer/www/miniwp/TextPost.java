package com.hasibezafer.www.miniwp;

public class TextPost extends Post {

	private String summary;

	public TextPost(String title, String body, String category) {
		super(title, body, category);
		generateSummary(body);
		// TODO Auto-generated constructor stub
	}

	public String getSummary() {
		return summary;
	}

	private void generateSummary(String body) {
		if (body.length() > 10) {
			summary = body.substring(0, 10);
			System.out.println("Your summary:" + getSummary());
			System.out.println("Added summary your TextPost!");
		} else
			summary = body;
			System.out.println("Your summary:" + getSummary());
			System.out.println("Your body short so added body your TextPost!");

	}

}
