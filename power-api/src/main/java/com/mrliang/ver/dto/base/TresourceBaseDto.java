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

public class TresourceBaseDto implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	private String sortColumns = "";
	//alias
	public static final String TABLE_ALIAS = "Tresource";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_AVAILABLE = "available";
	public static final String ALIAS_ICON = "icon";
	public static final String ALIAS_TNAME = "tname";
	public static final String ALIAS_PARENT_ID = "parentId";
	public static final String ALIAS_PERMISSION = "permission";
	public static final String ALIAS_REMARK = "remark";
	public static final String ALIAS_SORT = "sort";
	public static final String ALIAS_TYPE = "type";
	public static final String ALIAS_URL = "url";
	
	
	//columns START
	private java.lang.Integer id;
	private java.lang.Boolean available;
	private java.lang.String icon;
	private java.lang.String tname;
	private java.lang.Integer parentId;
	private java.lang.String permission;
	private java.lang.String remark;
	private java.lang.Integer sort;
	private java.lang.Integer type;
	private java.lang.String url;
	//columns END

		
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getId() {
		return this.id;
	}
		
	public void setAvailable(java.lang.Boolean value) {
		this.available = value;
	}
	
	public java.lang.Boolean getAvailable() {
		return this.available;
	}
		
	public void setIcon(java.lang.String value) {
		this.icon = value;
	}
	
	public java.lang.String getIcon() {
		return this.icon;
	}
		
	public void setTname(java.lang.String value) {
		this.tname = value;
	}
	
	public java.lang.String getTname() {
		return this.tname;
	}
		
	public void setParentId(java.lang.Integer value) {
		this.parentId = value;
	}
	
	public java.lang.Integer getParentId() {
		return this.parentId;
	}
		
	public void setPermission(java.lang.String value) {
		this.permission = value;
	}
	
	public java.lang.String getPermission() {
		return this.permission;
	}
		
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	public java.lang.String getRemark() {
		return this.remark;
	}
		
	public void setSort(java.lang.Integer value) {
		this.sort = value;
	}
	
	public java.lang.Integer getSort() {
		return this.sort;
	}
		
	public void setType(java.lang.Integer value) {
		this.type = value;
	}
	
	public java.lang.Integer getType() {
		return this.type;
	}
		
	public void setUrl(java.lang.String value) {
		this.url = value;
	}
	
	public java.lang.String getUrl() {
		return this.url;
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
			.append("Available",getAvailable())
			.append("Icon",getIcon())
			.append("Tname",getTname())
			.append("ParentId",getParentId())
			.append("Permission",getPermission())
			.append("Remark",getRemark())
			.append("Sort",getSort())
			.append("Type",getType())
			.append("Url",getUrl())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof TresourceBaseDto == false) return false;
		if(this == obj) return true;
		TresourceBaseDto other = (TresourceBaseDto)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

