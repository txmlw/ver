package com.mrliang.ver.service;

import com.mrliang.ver.dto.TauthGroupDto;
import java.util.List;
import java.util.Map;
import com.mrliang.common.page.PageInfo;
import org.springframework.stereotype.Repository;


public interface TauthGroupService {
	
	public void insert(TauthGroupDto tauthGroupDto) throws Exception;
	public void insert(List<TauthGroupDto> tauthGroupDtoList) throws Exception;
	/**
	 * 获取TauthGroup根据主键获取
	 * @param tauthGroupDto
	 * @return Map
	 */
	public TauthGroupDto findByPrimaryKey(TauthGroupDto tauthGroupDto) throws Exception;
	/**
	 * TauthGroup列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception;
	/**
	 * TauthGroup列表信息
	 * @param tauthGroupDto)
	 * @return List<TauthGroupDto>
	 */
	public List<TauthGroupDto> findList(TauthGroupDto tauthGroupDto) throws Exception;
	/**
	 * 删除单条
	 * @param tauthGroupDto
	 * @return 
	 */
	public int delete(TauthGroupDto tauthGroupDto) throws Exception;
	public int delete(List<TauthGroupDto> tauthGroupDtoList) throws Exception;
	/**
	 * 修改
	 * @param tauthGroupDto
	 * @return String
	 */
	public int update(TauthGroupDto tauthGroupDto) throws Exception;
	public long update(List<TauthGroupDto> tauthGroupDtoList) throws Exception;
	
}
