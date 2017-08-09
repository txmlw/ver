package com.mrliang.ver.dto;

import com.mrliang.ver.dto.base.TuserBaseDto;
import java.util.Date;
/**
 * 
 * base 字段和数据库一致，需要添加其他非数据库字段可以再此类中增加
 *
 */
public class TuserDto extends TuserBaseDto {
	
	private java.util.Date createAtBegin;
	private java.util.Date createAtEnd;
	private java.util.Date expireAtBegin;
	private java.util.Date expireAtEnd;
	private java.util.Date updateAtBegin;
	private java.util.Date updateAtEnd;
	
		public Date getCreateAtBegin() {
			return createAtBegin;
		}
		public void setCreateAtBegin(Date createAtBegin) {
			this.createAtBegin = createAtBegin;
		}
		public Date getCreateAtEnd() {
			return createAtEnd;
		}
		public void setCreateAtEnd(Date createAtEnd) {
			this.createAtEnd = createAtEnd;
		}
		public Date getExpireAtBegin() {
			return expireAtBegin;
		}
		public void setExpireAtBegin(Date expireAtBegin) {
			this.expireAtBegin = expireAtBegin;
		}
		public Date getExpireAtEnd() {
			return expireAtEnd;
		}
		public void setExpireAtEnd(Date expireAtEnd) {
			this.expireAtEnd = expireAtEnd;
		}
		public Date getUpdateAtBegin() {
			return updateAtBegin;
		}
		public void setUpdateAtBegin(Date updateAtBegin) {
			this.updateAtBegin = updateAtBegin;
		}
		public Date getUpdateAtEnd() {
			return updateAtEnd;
		}
		public void setUpdateAtEnd(Date updateAtEnd) {
			this.updateAtEnd = updateAtEnd;
		}
}
