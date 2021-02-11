package org.workspace.assignment;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question 
{
	private int questionId;
	private String question;
	private List<String> answer;
	private Set<String> answerSet;
	private Map<Integer,String> answerMap;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	
	public Set<String> getAnswerSet() {
		return answerSet;
	}
	public void setAnswerSet(Set<String> answerSet) {
		this.answerSet = answerSet;
	}
	public Map<Integer,String> getAnswerMap() {
		return answerMap;
	}
	public void setAnswerMap(Map<Integer,String> answerMap) {
		this.answerMap = answerMap;
	}
	

	
	public void displayInfo()
	{
		System.out.println(questionId+": "+question);
		System.out.println("----------------------");
		System.out.println("Answers are:");
		Iterator<String> itr = answer.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public void displayInfoviaSet()
	{
		System.out.println(questionId+": "+question);
		System.out.println("----------------------");
		System.out.println("Answers are:");
		Iterator<String> itr = answerSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public void displayInfoviaMap()
	{
		System.out.println(questionId+": "+question);
		System.out.println("----------------------");
		System.out.println("Answers are:");
		Set<Entry<Integer, String>> set = answerMap.entrySet();
		Iterator<Entry<Integer,String>> itr = set.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,String> entry = itr.next();
			System.out.println(entry.getKey()+" " +entry.getValue());
		}
	}
	
}
