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

public class TroleResourceBaseDto implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	private String sortColumns = "";
	//alias
	public static final String TABLE_ALIAS = "TroleResource";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_RESOURCE_ID = "resourceId";
	public static final String ALIAS_ROLE_ID = "roleId";
	public static final String ALIAS_AVAILABLE = "available";
	
	
	//columns START
	private java.lang.Integer id;
	private java.lang.Integer resourceId;
	private java.lang.Integer roleId;
	private java.lang.Boolean available;
	//columns END

		
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getId() {
		return this.id;
	}
		
	public void setResourceId(java.lang.Integer value) {
		this.resourceId = value;
	}
	
	public java.lang.Integer getResourceId() {
		return this.resourceId;
	}
		
	public void setRoleId(java.lang.Integer value) {
		this.roleId = value;
	}
	
	public java.lang.Integer getRoleId() {
		return this.roleId;
	}
		
	public void setAvailable(java.lang.Boolean value) {
		this.available = value;
	}
	
	public java.lang.Boolean getAvailable() {
		return this.available;
	}

	public String getSortColumns() {
		return sortColumns;
	}

	public void setSortColumns(String sortColumns) {
		this.sortColumns = sortColumns;
	}
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("ResourceId",getResourceId())
			.append("RoleId",getRoleId())
			.append("Available",getAvailable())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof TroleResourceBaseDto == false) return false;
		if(this == obj) return true;
		TroleResourceBaseDto other = (TroleResourceBaseDto)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

