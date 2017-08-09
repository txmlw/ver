package com.mrliang.ver.service;

import com.mrliang.ver.dto.TresourceDto;
import java.util.List;
import java.util.Map;
import com.mrliang.common.page.PageInfo;
import org.springframework.stereotype.Repository;


public interface TresourceService {
	
	public void insert(TresourceDto tresourceDto) throws Exception;
	public void insert(List<TresourceDto> tresourceDtoList) throws Exception;
	/**
	 * 获取Tresource根据主键获取
	 * @param tresourceDto
	 * @return Map
	 */
	public TresourceDto findByPrimaryKey(TresourceDto tresourceDto) throws Exception;
	/**
	 * Tresource列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception;
	/**
	 * Tresource列表信息
	 * @param tresourceDto)
	 * @return List<TresourceDto>
	 */
	public List<TresourceDto> findList(TresourceDto tresourceDto) throws Exception;
	/**
	 * 删除单条
	 * @param tresourceDto
	 * @return 
	 */
	public int delete(TresourceDto tresourceDto) throws Exception;
	public int delete(List<TresourceDto> tresourceDtoList) throws Exception;
	/**
	 * 修改
	 * @param tresourceDto
	 * @return String
	 */
	public int update(TresourceDto tresourceDto) throws Exception;
	public long update(List<TresourceDto> tresourceDtoList) throws Exception;
	
}
