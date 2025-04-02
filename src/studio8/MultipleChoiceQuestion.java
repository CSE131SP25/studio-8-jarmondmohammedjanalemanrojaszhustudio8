package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {

	private static String hot;
	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	private String prompt;
	private String answer;
	private int points;
	private String [] choices;
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		// Call the super class constructor, then create and set
		// instance variables for any values that aren't handled
		// by the base class
			super(prompt, answer, points);
			this.choices = choices;
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		super.displayPrompt ();
		
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
			return choices;
	}
	
	
	public static void main(String[] args) {
		// TODO: create your own MultipleChoiceQuestion
	String[] choices = { "oat", "whole" , "coconut" } ;
	MultipleChoiceQuestion  webster = new MultipleChoiceQuestion("What milk do you use in coffee?","2", 1, String[] choices);
	
	
	}

}
