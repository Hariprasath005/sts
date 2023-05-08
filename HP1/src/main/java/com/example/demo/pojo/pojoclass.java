package com.example.demo.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class pojoclass {
	@Id
	private int id;
	private String bikename;
	private String version;
	private String cc;
	private String manufactureyear;
	private String onroadprice;
	private String bikecolour;
	private String totalprice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBikename() {
		return bikename;
	}
	public void setBikename(String bikename) {
		this.bikename = bikename;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getManufactureyear() {
		return manufactureyear;
	}
	public void setManufactureyear(String manufactureyear) {
		this.manufactureyear = manufactureyear;
	}
	public String getOnroadprice() {
		return onroadprice;
	}
	public void setOnroadprice(String onroadprice) {
		this.onroadprice = onroadprice;
	}
	public String getBikecolour() {
		return bikecolour;
	}
	public void setBikecolour(String bikecolour) {
		this.bikecolour = bikecolour;
	}
	public String getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(String totalprice) {
		this.totalprice = totalprice;
	}
	@Override
	public String toString() {
		return "pojoclass [id=" + id + ", bikename=" + bikename + ", version=" + version + ", cc=" + cc
				+ ", manufactureyear=" + manufactureyear + ", onroadprice=" + onroadprice + ", bikecolour=" + bikecolour
				+ ", totalprice=" + totalprice + "]";
	}
	
}