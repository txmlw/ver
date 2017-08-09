package com.mrliang.ver.service;

import com.mrliang.ver.dto.TgroupRoleDto;
import java.util.List;
import java.util.Map;
import com.mrliang.common.page.PageInfo;
import org.springframework.stereotype.Repository;


public interface TgroupRoleService {
	
	public void insert(TgroupRoleDto tgroupRoleDto) throws Exception;
	public void insert(List<TgroupRoleDto> tgroupRoleDtoList) throws Exception;
	/**
	 * 获取TgroupRole根据主键获取
	 * @param tgroupRoleDto
	 * @return Map
	 */
	public TgroupRoleDto findByPrimaryKey(TgroupRoleDto tgroupRoleDto) throws Exception;
	/**
	 * TgroupRole列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception;
	/**
	 * TgroupRole列表信息
	 * @param tgroupRoleDto)
	 * @return List<TgroupRoleDto>
	 */
	public List<TgroupRoleDto> findList(TgroupRoleDto tgroupRoleDto) throws Exception;
	/**
	 * 删除单条
	 * @param tgroupRoleDto
	 * @return 
	 */
	public int delete(TgroupRoleDto tgroupRoleDto) throws Exception;
	public int delete(List<TgroupRoleDto> tgroupRoleDtoList) throws Exception;
	/**
	 * 修改
	 * @param tgroupRoleDto
	 * @return String
	 */
	public int update(TgroupRoleDto tgroupRoleDto) throws Exception;
	public long update(List<TgroupRoleDto> tgroupRoleDtoList) throws Exception;
	
}
