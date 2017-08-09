package com.mrliang.ver.service.impl;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.mrliang.ver.dto.TauthGroupDto;
import com.mrliang.ver.dao.TauthGroupDao;
import com.mrliang.common.page.PageInfo;
import com.mrliang.ver.service.TauthGroupService;

@Component("tauthGroupService")
public class TauthGroupServiceImpl  implements TauthGroupService {
	public TauthGroupDao tauthGroupDao;
	
	@Autowired
	public void setTauthGroupDao(TauthGroupDao tauthGroupDao) {
		this.tauthGroupDao = tauthGroupDao;
	}
	/**
	 * TauthGroup插入一条数据
	 * @param tauthGroupDto
	 * @return String
	 */
	public void insert(TauthGroupDto tauthGroupDto) throws Exception{
		tauthGroupDao.insert(tauthGroupDto);
	}
	/**
	 * TauthGroup批量插入数据
	 * @param tauthGroupDtoList
	 * @return String
	 */
	@Transactional
	public void insert(List<TauthGroupDto> tauthGroupDtoList) throws Exception{
		tauthGroupDao.insert(tauthGroupDtoList);
	}
	/**
	 * 获取TauthGroup根据主键获取
	 * @param tauthGroupDto
	 * @return Map
	 */
	public TauthGroupDto findByPrimaryKey(TauthGroupDto tauthGroupDto) throws Exception{
		return tauthGroupDao.findByPrimaryKey(tauthGroupDto);
	}
	/**
	 * TauthGroup列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception{
		return tauthGroupDao.findPage(pageIno);
	}
	/**
	 * TauthGroup列表信息
	 * @param tauthGroupDto)
	 * @return List<TauthGroupDto>
	 */
	public List<TauthGroupDto> findList(TauthGroupDto tauthGroupDto) throws Exception{
		return tauthGroupDao.findList(tauthGroupDto);
	}
	/**
	 * 删除单条
	 * @param tauthGroupDto
	 * @return 
	 */
	public int delete(TauthGroupDto tauthGroupDto) throws Exception{
		return tauthGroupDao.delete(tauthGroupDto);
	}
	@Transactional
	public int delete(List<TauthGroupDto> tauthGroupDtoList) throws Exception{
		return tauthGroupDao.delete(tauthGroupDtoList);
	}
	/**
	 * 修改
	 * @param tauthGroupDto
	 * @return String
	 */
	public int update(TauthGroupDto tauthGroupDto) throws Exception{
		return  tauthGroupDao.update(tauthGroupDto);
	}
	@Transactional
	public long update(List<TauthGroupDto> tauthGroupDtoList) throws Exception{
		return  tauthGroupDao.update(tauthGroupDtoList);
	}
}
