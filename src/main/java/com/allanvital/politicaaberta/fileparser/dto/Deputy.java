package com.allanvital.politicaaberta.fileparser.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Deputy {
	
	private int siteId;
	private String name;
	private String party;
	private String uf;
	private int secondarySiteId;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getParty() {
		return party;
	}
	
	public void setParty(String party) {
		this.party = party;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public int getSiteId() {
		return siteId;
	}
	
	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	public int getSecondarySiteId() {
		return secondarySiteId;
	}
	
	public void setSecondarySiteId(int secondarySiteId) {
		this.secondarySiteId = secondarySiteId;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("siteId", siteId)
				.append("name", name)
				.append("party", party)
				.append("uf", uf)
				.append("secondarySiteId", secondarySiteId)
				.toString();
	}
}
