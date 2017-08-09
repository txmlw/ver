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

public class TmenuBaseDto implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	private String sortColumns = "";
	//alias
	public static final String TABLE_ALIAS = "Tmenu";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_ICON = "icon";
	public static final String ALIAS_TNAME = "tname";
	public static final String ALIAS_PARENT_ID = "parentId";
	public static final String ALIAS_SORT = "sort";
	public static final String ALIAS_URL = "url";
	
	
	//columns START
	private java.lang.Integer id;
	private java.lang.String icon;
	private java.lang.String tname;
	private java.lang.Integer parentId;
	private java.lang.Integer sort;
	private java.lang.String url;
	//columns END

		
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getId() {
		return this.id;
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
		
	public void setSort(java.lang.Integer value) {
		this.sort = value;
	}
	
	public java.lang.Integer getSort() {
		return this.sort;
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
			.append("Icon",getIcon())
			.append("Tname",getTname())
			.append("ParentId",getParentId())
			.append("Sort",getSort())
			.append("Url",getUrl())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof TmenuBaseDto == false) return false;
		if(this == obj) return true;
		TmenuBaseDto other = (TmenuBaseDto)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

