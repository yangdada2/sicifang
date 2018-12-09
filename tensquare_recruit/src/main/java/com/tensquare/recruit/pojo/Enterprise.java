package com.tensquare.recruit.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
/**
 * 实体类
 * @author Administrator
 *
 */
@Entity
@Table(name="tb_enterprise")
public class Enterprise implements Serializable{

	@Id
	private VARCHAR id;//ID


	
	private VARCHAR name;//企业名称
	private VARCHAR summary;//企业简介
	private VARCHAR address;//企业地址
	private VARCHAR labels;//标签列表
	private VARCHAR coordinate;//坐标
	private VARCHAR ishot;//是否热门
	private VARCHAR logo;//LOGO
	private INT jobcount;//职位数
	private VARCHAR url;//URL

	
	public VARCHAR getId() {		
		return id;
	}
	public void setId(VARCHAR id) {
		this.id = id;
	}

	public VARCHAR getName() {		
		return name;
	}
	public void setName(VARCHAR name) {
		this.name = name;
	}

	public VARCHAR getSummary() {		
		return summary;
	}
	public void setSummary(VARCHAR summary) {
		this.summary = summary;
	}

	public VARCHAR getAddress() {		
		return address;
	}
	public void setAddress(VARCHAR address) {
		this.address = address;
	}

	public VARCHAR getLabels() {		
		return labels;
	}
	public void setLabels(VARCHAR labels) {
		this.labels = labels;
	}

	public VARCHAR getCoordinate() {		
		return coordinate;
	}
	public void setCoordinate(VARCHAR coordinate) {
		this.coordinate = coordinate;
	}

	public VARCHAR getIshot() {		
		return ishot;
	}
	public void setIshot(VARCHAR ishot) {
		this.ishot = ishot;
	}

	public VARCHAR getLogo() {		
		return logo;
	}
	public void setLogo(VARCHAR logo) {
		this.logo = logo;
	}

	public INT getJobcount() {		
		return jobcount;
	}
	public void setJobcount(INT jobcount) {
		this.jobcount = jobcount;
	}

	public VARCHAR getUrl() {		
		return url;
	}
	public void setUrl(VARCHAR url) {
		this.url = url;
	}


	
}
