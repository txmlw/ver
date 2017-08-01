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
	public static final String ALIAS_CODECODE = "codecode";
	public static final String ALIAS_CODENAME = "codename";
	public static final String ALIAS_CODEVALUE = "codevalue";
	public static final String ALIAS_CODETYPE = "codetype";
	public static final String ALIAS_STATUS = "status";
	
	
	//columns START
	private java.lang.String codecode;
	private java.lang.String codename;
	private java.lang.String codevalue;
	private java.lang.String codetype;
	private java.lang.String status;
	//columns END

		
	public void setCodecode(java.lang.String value) {
		this.codecode = value;
	}
	
	public java.lang.String getCodecode() {
		return this.codecode;
	}
		
	public void setCodename(java.lang.String value) {
		this.codename = value;
	}
	
	public java.lang.String getCodename() {
		return this.codename;
	}
		
	public void setCodevalue(java.lang.String value) {
		this.codevalue = value;
	}
	
	public java.lang.String getCodevalue() {
		return this.codevalue;
	}
		
	public void setCodetype(java.lang.String value) {
		this.codetype = value;
	}
	
	public java.lang.String getCodetype() {
		return this.codetype;
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
			.append("Codecode",getCodecode())
			.append("Codename",getCodename())
			.append("Codevalue",getCodevalue())
			.append("Codetype",getCodetype())
			.append("Status",getStatus())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getCodecode())
			.append(getCodetype())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof TconfigBaseDto == false) return false;
		if(this == obj) return true;
		TconfigBaseDto other = (TconfigBaseDto)obj;
		return new EqualsBuilder()
			.append(getCodecode(),other.getCodecode())
			.append(getCodetype(),other.getCodetype())
			.isEquals();
	}
}

