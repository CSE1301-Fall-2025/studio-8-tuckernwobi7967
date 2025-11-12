package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {
	String[] choices;

	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt,answer,points);
		this.choices = choices;
		// Call the super class constructor, then create and set
		// instance variables for any values that aren't handled
		// by the base class
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	@Override
	public void displayPrompt() {
		super.displayPrompt();
		for(int i = 0; i<choices.length; i++){
			System.out.println((i+1) + ". " + choices[i]);
		}
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return choices;
	}
	
	public static void main(String[] args) {
		MultipleChoiceQuestion q1 = new MultipleChoiceQuestion("What is the capital of Missouri?", "Kansas City", 10, new String[] {"Kansas City", "St. Louis", "Springfield"});
		q1.displayPrompt();
	}

}
