package com.mrliang.ver.service;

import com.mrliang.ver.dto.TuserGroupDto;
import java.util.List;
import java.util.Map;
import com.mrliang.common.page.PageInfo;
import org.springframework.stereotype.Repository;


public interface TuserGroupService {
	
	public void insert(TuserGroupDto tuserGroupDto) throws Exception;
	public void insert(List<TuserGroupDto> tuserGroupDtoList) throws Exception;
	/**
	 * 获取TuserGroup根据主键获取
	 * @param tuserGroupDto
	 * @return Map
	 */
	public TuserGroupDto findByPrimaryKey(TuserGroupDto tuserGroupDto) throws Exception;
	/**
	 * TuserGroup列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception;
	/**
	 * TuserGroup列表信息
	 * @param tuserGroupDto)
	 * @return List<TuserGroupDto>
	 */
	public List<TuserGroupDto> findList(TuserGroupDto tuserGroupDto) throws Exception;
	/**
	 * 删除单条
	 * @param tuserGroupDto
	 * @return 
	 */
	public int delete(TuserGroupDto tuserGroupDto) throws Exception;
	public int delete(List<TuserGroupDto> tuserGroupDtoList) throws Exception;
	/**
	 * 修改
	 * @param tuserGroupDto
	 * @return String
	 */
	public int update(TuserGroupDto tuserGroupDto) throws Exception;
	public long update(List<TuserGroupDto> tuserGroupDtoList) throws Exception;
	
}
