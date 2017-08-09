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

public class PrpdcodeBaseDto implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;
	private String sortColumns = "";
	//alias
	public static final String TABLE_ALIAS = "Prpdcode";
	public static final String ALIAS_CODE_CODE = "codeCode";
	public static final String ALIAS_CODE_NAME = "codeName";
	
	
	//columns START
	private java.lang.String codeCode;
	private java.lang.String codeName;
	//columns END

		
	public void setCodeCode(java.lang.String value) {
		this.codeCode = value;
	}
	
	public java.lang.String getCodeCode() {
		return this.codeCode;
	}
		
	public void setCodeName(java.lang.String value) {
		this.codeName = value;
	}
	
	public java.lang.String getCodeName() {
		return this.codeName;
	}

	public String getSortColumns() {
		return sortColumns;
	}

	public void setSortColumns(String sortColumns) {
		this.sortColumns = sortColumns;
	}
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("CodeCode",getCodeCode())
			.append("CodeName",getCodeName())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getCodeCode())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof PrpdcodeBaseDto == false) return false;
		if(this == obj) return true;
		PrpdcodeBaseDto other = (PrpdcodeBaseDto)obj;
		return new EqualsBuilder()
			.append(getCodeCode(),other.getCodeCode())
			.isEquals();
	}
}

