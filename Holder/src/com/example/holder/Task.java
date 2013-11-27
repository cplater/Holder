/**
 * 
 */
package com.example.holder;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.UUID;

/**
 * @author cplater
 *
 */
public class Task {
	private UUID id;
	private String title;
	private String description;
	private String status;
	private Calendar dueDate;
	private String category;
	private String priority;
	 
	
	public Task (String title, String description, String status, Calendar dueDate,
			String category, String priority)
	{
		this.id = UUID.randomUUID();
		this.title = title;
		this.description = description;
		this.status = status;
		this.dueDate = dueDate;
		this.category = category;
		this.priority = priority;
	}

	public String toFullString(){
		return(
			"\nTask id:     " + this.id +
			"\nTitle:       " + this.title +
			"\nDescription: " + this.description +
			"\nStatus:      " + this.status +
			"\nDue Date:    " + DateFormat.getDateInstance(DateFormat.MEDIUM).format( this.dueDate.getTime()) +
			"\nCategory:    " + this.category +
			"\nPriority:    " + this.priority +
			"\n==============="
		);
	}
	
	public String toString(){
		return(
			this.title + ", " + this.status + " " +
			DateFormat.getDateInstance(DateFormat.MEDIUM).format( this.dueDate.getTime())
		);
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}


	/**
	 * @return the dueDate
	 */
	public Calendar getDueDate() {
		return dueDate;
	}


	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(Calendar dueDate) {
		this.dueDate = dueDate;
	}


	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}


	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}


	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}


	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}


	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}
	
	
}
