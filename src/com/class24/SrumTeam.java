package com.class24;

public class SrumTeam extends Employee {
	public String artifacts;
	public String ceremonies;
	
	public void workOnArtifacts() {
		System.out.println("scrum team work on "+artifacts);
	}
public void attendScrumMeetings() {
	System.out.println("Scrum Team attends "+ceremonies);
}
}
