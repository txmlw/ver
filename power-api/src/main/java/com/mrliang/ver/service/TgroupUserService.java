package com.mrliang.ver.service;

import com.mrliang.ver.dto.TgroupUserDto;
import java.util.List;
import java.util.Map;
import com.mrliang.common.page.PageInfo;
import org.springframework.stereotype.Repository;


public interface TgroupUserService {
	
	public void insert(TgroupUserDto tgroupUserDto) throws Exception;
	public void insert(List<TgroupUserDto> tgroupUserDtoList) throws Exception;
	/**
	 * 获取TgroupUser根据主键获取
	 * @param tgroupUserDto
	 * @return Map
	 */
	public TgroupUserDto findByPrimaryKey(TgroupUserDto tgroupUserDto) throws Exception;
	/**
	 * TgroupUser列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception;
	/**
	 * TgroupUser列表信息
	 * @param tgroupUserDto)
	 * @return List<TgroupUserDto>
	 */
	public List<TgroupUserDto> findList(TgroupUserDto tgroupUserDto) throws Exception;
	/**
	 * 删除单条
	 * @param tgroupUserDto
	 * @return 
	 */
	public int delete(TgroupUserDto tgroupUserDto) throws Exception;
	public int delete(List<TgroupUserDto> tgroupUserDtoList) throws Exception;
	/**
	 * 修改
	 * @param tgroupUserDto
	 * @return String
	 */
	public int update(TgroupUserDto tgroupUserDto) throws Exception;
	public long update(List<TgroupUserDto> tgroupUserDtoList) throws Exception;
	
}
