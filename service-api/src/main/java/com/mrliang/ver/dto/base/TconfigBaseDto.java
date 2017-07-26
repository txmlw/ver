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

public class TconfigBaseDto implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	private String sortColumns = "";
	//alias
	public static final String TABLE_ALIAS = "Tconfig";
	public static final String ALIAS_PCODE = "pcode";
	public static final String ALIAS_PNAME = "pname";
	public static final String ALIAS_PTYPE = "ptype";
	public static final String ALIAS_STATUS = "status";
	
	
	//columns START
	private java.lang.String pcode;
	private java.lang.String pname;
	private java.lang.String ptype;
	private java.lang.String status;
	//columns END

		
	public void setPcode(java.lang.String value) {
		this.pcode = value;
	}
	
	public java.lang.String getPcode() {
		return this.pcode;
	}
		
	public void setPname(java.lang.String value) {
		this.pname = value;
	}
	
	public java.lang.String getPname() {
		return this.pname;
	}
		
	public void setPtype(java.lang.String value) {
		this.ptype = value;
	}
	
	public java.lang.String getPtype() {
		return this.ptype;
	}
		
	public void setStatus(java.lang.String value) {
		this.status = value;
	}
	
	public java.lang.String getStatus() {
		return this.status;
	}

	public String getSortColumns() {
		return sortColumns;
	}

	public void setSortColumns(String sortColumns) {
		this.sortColumns = sortColumns;
	}
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Pcode",getPcode())
			.append("Pname",getPname())
			.append("Ptype",getPtype())
			.append("Status",getStatus())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getPcode())
			.append(getPtype())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof TconfigBaseDto == false) return false;
		if(this == obj) return true;
		TconfigBaseDto other = (TconfigBaseDto)obj;
		return new EqualsBuilder()
			.append(getPcode(),other.getPcode())
			.append(getPtype(),other.getPtype())
			.isEquals();
	}
}

