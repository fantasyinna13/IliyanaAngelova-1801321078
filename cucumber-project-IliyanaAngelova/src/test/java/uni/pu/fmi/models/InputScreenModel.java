package uni.pu.fmi.models;

import uni.pu.fmi.services.InsertService;

public class InputScreenModel {

	
	private String subject;
	private String name;
	private String grade;
	private String message;
	

	public void navigateToMe() {
		System.out.println("Страницата за въвеждане на оценка е отворена.");
		
	}

	public void insertSubject(final String subject) {
		this.subject = subject;
		
	}

	public void insertName(String name) {
		this.name = name; 
		
	}

	public void insertGrade(String grade) {
		this.grade = grade; 
		
	}

	 public void clickAddButton() {
		message = InsertService.insert(subject,name,grade);
		
	}
	
	public String getAddMessage() {
		return message;    
	}

}
