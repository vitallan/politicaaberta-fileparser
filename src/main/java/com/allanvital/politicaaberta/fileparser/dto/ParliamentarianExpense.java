package com.allanvital.politicaaberta.fileparser.dto;

import java.math.BigDecimal;
import java.util.Calendar;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ParliamentarianExpense {

	private int deputySiteId;
	private String description;
	private BigDecimal value;
	private String urlDetails;
	private Calendar expenseMonthAndYear;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getUrlDetails() {
		return urlDetails;
	}

	public void setUrlDetails(String urlDetails) {
		this.urlDetails = urlDetails;
	}
	
	public Calendar getExpenseMonthAndYear() {
		return expenseMonthAndYear;
	}

	public void setExpenseMonthAndYear(Calendar expenseMonthAndYear) {
		this.expenseMonthAndYear = expenseMonthAndYear;
	}

	public int getDeputySiteId() {
		return deputySiteId;
	}

	public void setDeputySiteId(int deputySiteId) {
		this.deputySiteId = deputySiteId;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("deputySiteId", deputySiteId)
				.append("ExpenseMonth", expenseMonthAndYear.get(Calendar.MONTH))
				.append("ExpenseYear", expenseMonthAndYear.get(Calendar.YEAR))
				.append("Value", value)
				.append("Description", description)
				.toString();
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
		        .append(deputySiteId)
		        .append(description)
		        .append(value)
		        .append(expenseMonthAndYear)
		        .toHashCode();
	}
	
	@Override
	public boolean equals(Object object) {
		if(object !=null && object instanceof ParliamentarianExpense){
			final ParliamentarianExpense other = (ParliamentarianExpense) object;
			return new EqualsBuilder()
					.append(deputySiteId, other.deputySiteId)
					.append(description, other.description)
					.append(value, other.value)
					.append(expenseMonthAndYear, other.expenseMonthAndYear)
					.isEquals();
		} 
		return false;
	}
	
}
