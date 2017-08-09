package com.mrliang.ver.service;

import com.mrliang.ver.dto.TmenuDto;
import java.util.List;
import java.util.Map;
import com.mrliang.common.page.PageInfo;
import org.springframework.stereotype.Repository;


public interface TmenuService {
	
	public void insert(TmenuDto tmenuDto) throws Exception;
	public void insert(List<TmenuDto> tmenuDtoList) throws Exception;
	/**
	 * 获取Tmenu根据主键获取
	 * @param tmenuDto
	 * @return Map
	 */
	public TmenuDto findByPrimaryKey(TmenuDto tmenuDto) throws Exception;
	/**
	 * Tmenu列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception;
	/**
	 * Tmenu列表信息
	 * @param tmenuDto)
	 * @return List<TmenuDto>
	 */
	public List<TmenuDto> findList(TmenuDto tmenuDto) throws Exception;
	/**
	 * 删除单条
	 * @param tmenuDto
	 * @return 
	 */
	public int delete(TmenuDto tmenuDto) throws Exception;
	public int delete(List<TmenuDto> tmenuDtoList) throws Exception;
	/**
	 * 修改
	 * @param tmenuDto
	 * @return String
	 */
	public int update(TmenuDto tmenuDto) throws Exception;
	public long update(List<TmenuDto> tmenuDtoList) throws Exception;
	
}
