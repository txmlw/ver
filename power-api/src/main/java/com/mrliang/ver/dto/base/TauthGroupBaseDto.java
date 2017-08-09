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

public class TauthGroupBaseDto implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	private String sortColumns = "";
	//alias
	public static final String TABLE_ALIAS = "TauthGroup";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_AVAILABLE = "available";
	public static final String ALIAS_TNAME = "tname";
	public static final String ALIAS_REMARK = "remark";
	
	
	//columns START
	private java.lang.Integer id;
	private java.lang.Boolean available;
	private java.lang.String tname;
	private java.lang.String remark;
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
		
	public void setTname(java.lang.String value) {
		this.tname = value;
	}
	
	public java.lang.String getTname() {
		return this.tname;
	}
		
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	public java.lang.String getRemark() {
		return this.remark;
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
			.append("Tname",getTname())
			.append("Remark",getRemark())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof TauthGroupBaseDto == false) return false;
		if(this == obj) return true;
		TauthGroupBaseDto other = (TauthGroupBaseDto)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

