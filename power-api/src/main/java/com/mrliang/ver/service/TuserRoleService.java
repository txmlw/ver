package com.mrliang.ver.service;

import com.mrliang.ver.dto.TuserRoleDto;
import java.util.List;
import java.util.Map;
import com.mrliang.common.page.PageInfo;
import org.springframework.stereotype.Repository;


public interface TuserRoleService {
	
	public void insert(TuserRoleDto tuserRoleDto) throws Exception;
	public void insert(List<TuserRoleDto> tuserRoleDtoList) throws Exception;
	/**
	 * 获取TuserRole根据主键获取
	 * @param tuserRoleDto
	 * @return Map
	 */
	public TuserRoleDto findByPrimaryKey(TuserRoleDto tuserRoleDto) throws Exception;
	/**
	 * TuserRole列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception;
	/**
	 * TuserRole列表信息
	 * @param tuserRoleDto)
	 * @return List<TuserRoleDto>
	 */
	public List<TuserRoleDto> findList(TuserRoleDto tuserRoleDto) throws Exception;
	/**
	 * 删除单条
	 * @param tuserRoleDto
	 * @return 
	 */
	public int delete(TuserRoleDto tuserRoleDto) throws Exception;
	public int delete(List<TuserRoleDto> tuserRoleDtoList) throws Exception;
	/**
	 * 修改
	 * @param tuserRoleDto
	 * @return String
	 */
	public int update(TuserRoleDto tuserRoleDto) throws Exception;
	public long update(List<TuserRoleDto> tuserRoleDtoList) throws Exception;
	
}
