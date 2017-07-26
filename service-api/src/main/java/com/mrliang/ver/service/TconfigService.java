package com.mrliang.ver.service;

import com.mrliang.ver.dto.TconfigDto;
import java.util.List;
import java.util.Map;
import com.mrliang.common.page.PageInfo;
import org.springframework.stereotype.Repository;


public interface TconfigService {
	
	public void insert(TconfigDto tconfigDto) throws Exception;
	public void insert(List<TconfigDto> tconfigDtoList) throws Exception;
	/**
	 * 获取Tconfig根据主键获取
	 * @param tconfigDto
	 * @return Map
	 */
	public TconfigDto findByPrimaryKey(TconfigDto tconfigDto) throws Exception;
	/**
	 * Tconfig列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception;
	/**
	 * 删除单条
	 * @param tconfigDto
	 * @return 
	 */
	public int delete(TconfigDto tconfigDto) throws Exception;
	public int delete(List<TconfigDto> tconfigDtoList) throws Exception;
	/**
	 * 修改
	 * @param tconfigDto
	 * @return String
	 */
	public int update(TconfigDto tconfigDto) throws Exception;
	public long update(List<TconfigDto> tconfigDtoList) throws Exception;
	
}
