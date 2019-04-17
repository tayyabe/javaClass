package com.class24;

public class Test {
	public static void main(String[] args) {
		
	
System.out.println("---creating employee object--");
	Employee obj=new Employee();
	obj.salary=900000;
	obj.getPaid();
System.out.println("------ creating developer------");	
	
	SrumTeam st=new SrumTeam();
	st.salary=100000;
	st.getPaid();
	st.artifacts="Product Backlog, Sprint backlog, BurnDown chart";
	st.ceremonies="Sprint grooming, Sprint planning, daily standup, Sprint demo";
	st.attendScrumMeetings();
	st.workOnArtifacts();
	
	System.out.println("---Creating Tester object---");
	Testers qa =new Testers();
	qa.salary=100000;
	qa.getPaid();
	qa.artifacts="Sprit backlog";
	qa.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
	qa.workOnArtifacts();
	qa.attendScrumMeetings();
	qa.test();

	
	
	
	}
}