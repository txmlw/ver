package com.mrliang.ver.service;

import com.mrliang.ver.dto.TroleResourceDto;
import java.util.List;
import java.util.Map;
import com.mrliang.common.page.PageInfo;
import org.springframework.stereotype.Repository;


public interface TroleResourceService {
	
	public void insert(TroleResourceDto troleResourceDto) throws Exception;
	public void insert(List<TroleResourceDto> troleResourceDtoList) throws Exception;
	/**
	 * 获取TroleResource根据主键获取
	 * @param troleResourceDto
	 * @return Map
	 */
	public TroleResourceDto findByPrimaryKey(TroleResourceDto troleResourceDto) throws Exception;
	/**
	 * TroleResource列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception;
	/**
	 * TroleResource列表信息
	 * @param troleResourceDto)
	 * @return List<TroleResourceDto>
	 */
	public List<TroleResourceDto> findList(TroleResourceDto troleResourceDto) throws Exception;
	/**
	 * 删除单条
	 * @param troleResourceDto
	 * @return 
	 */
	public int delete(TroleResourceDto troleResourceDto) throws Exception;
	public int delete(List<TroleResourceDto> troleResourceDtoList) throws Exception;
	/**
	 * 修改
	 * @param troleResourceDto
	 * @return String
	 */
	public int update(TroleResourceDto troleResourceDto) throws Exception;
	public long update(List<TroleResourceDto> troleResourceDtoList) throws Exception;
	
}
