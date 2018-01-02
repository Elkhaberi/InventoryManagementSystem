package com.kossine.ims.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;
@NamedQueries({
@NamedQuery(query = "Select e from Monitor e where e.monitorTag= :tag", name = "Monitor.getByTag")
})
@Entity
public class Monitor extends Inventory {
	@Column(name = "monitor_tag", unique = true, nullable = false)
	@Pattern(regexp = "^MON/\\w+/\\w+/\\d+$")
	private String monitorTag;
	private String brand;
	@Column(name = "serial_num")
	private String serialNum;
	@Column(name = "model_num")
	private String modelNum;
	private String resolution;
	private String location;
	private Boolean used;
	@OneToOne(mappedBy="monitor")
	@Transient
	private Pc pc;
	public Monitor() {
		super("Monitor", Monitor.class);
	}

	public String getMonitorTag() {
		return monitorTag;
	}

	public void setMonitorTag(String monitorTag) {
		this.monitorTag = monitorTag;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public String getModelNum() {
		return modelNum;
	}

	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Boolean getUsed() {
		return used;
	}

	public void setUsed(Boolean used) {
		this.used = used;
	}

	@Override
	public String toString() {
		return "Monitor [monitorTag=" + monitorTag + ", brand=" + brand + ", serialNum=" + serialNum + ", modelNum="
				+ modelNum + ", resolution=" + resolution + ", location=" + location + ", used=" + used + "]";
	}

}