package com.mrliang.ver.service;

import com.mrliang.ver.dto.TroleDto;
import java.util.List;
import java.util.Map;
import com.mrliang.common.page.PageInfo;
import org.springframework.stereotype.Repository;


public interface TroleService {
	
	public void insert(TroleDto troleDto) throws Exception;
	public void insert(List<TroleDto> troleDtoList) throws Exception;
	/**
	 * 获取Trole根据主键获取
	 * @param troleDto
	 * @return Map
	 */
	public TroleDto findByPrimaryKey(TroleDto troleDto) throws Exception;
	/**
	 * Trole列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception;
	/**
	 * Trole列表信息
	 * @param troleDto)
	 * @return List<TroleDto>
	 */
	public List<TroleDto> findList(TroleDto troleDto) throws Exception;
	/**
	 * 删除单条
	 * @param troleDto
	 * @return 
	 */
	public int delete(TroleDto troleDto) throws Exception;
	public int delete(List<TroleDto> troleDtoList) throws Exception;
	/**
	 * 修改
	 * @param troleDto
	 * @return String
	 */
	public int update(TroleDto troleDto) throws Exception;
	public long update(List<TroleDto> troleDtoList) throws Exception;
	
}
