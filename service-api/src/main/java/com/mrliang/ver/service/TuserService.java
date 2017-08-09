package com.mrliang.ver.service;

import com.mrliang.ver.dto.TuserDto;
import java.util.List;
import java.util.Map;
import com.mrliang.common.page.PageInfo;
import org.springframework.stereotype.Repository;


public interface TuserService {
	
	public void insert(TuserDto tuserDto) throws Exception;
	public void insert(List<TuserDto> tuserDtoList) throws Exception;
	/**
	 * 获取Tuser根据主键获取
	 * @param tuserDto
	 * @return Map
	 */
	public TuserDto findByPrimaryKey(TuserDto tuserDto) throws Exception;
	/**
	 * Tuser列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception;
	/**
	 * Tuser列表信息
	 * @param tuserDto)
	 * @return List<TuserDto>
	 */
	public List<TuserDto> findList(TuserDto tuserDto) throws Exception;
	/**
	 * 删除单条
	 * @param tuserDto
	 * @return 
	 */
	public int delete(TuserDto tuserDto) throws Exception;
	public int delete(List<TuserDto> tuserDtoList) throws Exception;
	/**
	 * 修改
	 * @param tuserDto
	 * @return String
	 */
	public int update(TuserDto tuserDto) throws Exception;
	public long update(List<TuserDto> tuserDtoList) throws Exception;
	
}
