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
@Table(name="tb_recruit")
public class Recruit implements Serializable{

	@Id
	private VARCHAR id;//ID


	
	private VARCHAR jobname;//职位名称
	private VARCHAR salary;//薪资范围
	private VARCHAR condition;//经验要求
	private VARCHAR education;//学历要求
	private VARCHAR type;//任职方式
	private VARCHAR address;//办公地址
	private VARCHAR eid;//企业ID
	private DATETIME createtime;//创建日期
	private VARCHAR state;//状态
	private VARCHAR url;//网址
	private VARCHAR label;//标签
	private VARCHAR content1;//职位描述
	private VARCHAR content2;//职位要求

	
	public VARCHAR getId() {		
		return id;
	}
	public void setId(VARCHAR id) {
		this.id = id;
	}

	public VARCHAR getJobname() {		
		return jobname;
	}
	public void setJobname(VARCHAR jobname) {
		this.jobname = jobname;
	}

	public VARCHAR getSalary() {		
		return salary;
	}
	public void setSalary(VARCHAR salary) {
		this.salary = salary;
	}

	public VARCHAR getCondition() {		
		return condition;
	}
	public void setCondition(VARCHAR condition) {
		this.condition = condition;
	}

	public VARCHAR getEducation() {		
		return education;
	}
	public void setEducation(VARCHAR education) {
		this.education = education;
	}

	public VARCHAR getType() {		
		return type;
	}
	public void setType(VARCHAR type) {
		this.type = type;
	}

	public VARCHAR getAddress() {		
		return address;
	}
	public void setAddress(VARCHAR address) {
		this.address = address;
	}

	public VARCHAR getEid() {		
		return eid;
	}
	public void setEid(VARCHAR eid) {
		this.eid = eid;
	}

	public DATETIME getCreatetime() {		
		return createtime;
	}
	public void setCreatetime(DATETIME createtime) {
		this.createtime = createtime;
	}

	public VARCHAR getState() {		
		return state;
	}
	public void setState(VARCHAR state) {
		this.state = state;
	}

	public VARCHAR getUrl() {		
		return url;
	}
	public void setUrl(VARCHAR url) {
		this.url = url;
	}

	public VARCHAR getLabel() {		
		return label;
	}
	public void setLabel(VARCHAR label) {
		this.label = label;
	}

	public VARCHAR getContent1() {		
		return content1;
	}
	public void setContent1(VARCHAR content1) {
		this.content1 = content1;
	}

	public VARCHAR getContent2() {		
		return content2;
	}
	public void setContent2(VARCHAR content2) {
		this.content2 = content2;
	}


	
}
