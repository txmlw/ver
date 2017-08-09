package com.mrliang.ver.dto.base;


import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import com.mrliang.ver.dto.*;

public class TuserBaseDto implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	private String sortColumns = "";
	//alias
	public static final String TABLE_ALIAS = "Tuser";
	public static final String ALIAS_USERID = "userid";
	public static final String ALIAS_ADDRESS = "address";
	public static final String ALIAS_CREATE_AT = "createAt";
	public static final String ALIAS_EMAIL = "email";
	public static final String ALIAS_EXPIRE_AT = "expireAt";
	public static final String ALIAS_MOBILE_PHONE = "mobilePhone";
	public static final String ALIAS_PASSWORD = "password";
	public static final String ALIAS_REMARK = "remark";
	public static final String ALIAS_UPDATE_AT = "updateAt";
	public static final String ALIAS_USERNAME = "username";
	public static final String ALIAS_VALID = "valid";
	
	
	//columns START
	private java.lang.String userid;
	private java.lang.String address;
	private java.util.Date createAt;
	private java.lang.String email;
	private java.util.Date expireAt;
	private java.lang.String mobilePhone;
	private java.lang.String password;
	private java.lang.String remark;
	private java.util.Date updateAt;
	private java.lang.String username;
	private java.lang.String valid;
	//columns END

		
	public void setUserid(java.lang.String value) {
		this.userid = value;
	}
	
	public java.lang.String getUserid() {
		return this.userid;
	}
		
	public void setAddress(java.lang.String value) {
		this.address = value;
	}
	
	public java.lang.String getAddress() {
		return this.address;
	}
		
	public void setCreateAt(java.util.Date value) {
		this.createAt = value;
	}
	
	public java.util.Date getCreateAt() {
		return this.createAt;
	}
		
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
	}
		
	public void setExpireAt(java.util.Date value) {
		this.expireAt = value;
	}
	
	public java.util.Date getExpireAt() {
		return this.expireAt;
	}
		
	public void setMobilePhone(java.lang.String value) {
		this.mobilePhone = value;
	}
	
	public java.lang.String getMobilePhone() {
		return this.mobilePhone;
	}
		
	public void setPassword(java.lang.String value) {
		this.password = value;
	}
	
	public java.lang.String getPassword() {
		return this.password;
	}
		
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	public java.lang.String getRemark() {
		return this.remark;
	}
		
	public void setUpdateAt(java.util.Date value) {
		this.updateAt = value;
	}
	
	public java.util.Date getUpdateAt() {
		return this.updateAt;
	}
		
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	public java.lang.String getUsername() {
		return this.username;
	}
		
	public void setValid(java.lang.String value) {
		this.valid = value;
	}
	
	public java.lang.String getValid() {
		return this.valid;
	}

	public String getSortColumns() {
		return sortColumns;
	}

	public void setSortColumns(String sortColumns) {
		this.sortColumns = sortColumns;
	}
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Userid",getUserid())
			.append("Address",getAddress())
			.append("CreateAt",getCreateAt())
			.append("Email",getEmail())
			.append("ExpireAt",getExpireAt())
			.append("MobilePhone",getMobilePhone())
			.append("Password",getPassword())
			.append("Remark",getRemark())
			.append("UpdateAt",getUpdateAt())
			.append("Username",getUsername())
			.append("Valid",getValid())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getUserid())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof TuserBaseDto == false) return false;
		if(this == obj) return true;
		TuserBaseDto other = (TuserBaseDto)obj;
		return new EqualsBuilder()
			.append(getUserid(),other.getUserid())
			.isEquals();
	}
}

