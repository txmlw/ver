package com.mrliang.ver.service.impl;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.mrliang.ver.dto.TgroupRoleDto;
import com.mrliang.ver.dao.TgroupRoleDao;
import com.mrliang.common.page.PageInfo;
import com.mrliang.ver.service.TgroupRoleService;

@Component("tgroupRoleService")
public class TgroupRoleServiceImpl  implements TgroupRoleService {
	public TgroupRoleDao tgroupRoleDao;
	
	@Autowired
	public void setTgroupRoleDao(TgroupRoleDao tgroupRoleDao) {
		this.tgroupRoleDao = tgroupRoleDao;
	}
	/**
	 * TgroupRole插入一条数据
	 * @param tgroupRoleDto
	 * @return String
	 */
	public void insert(TgroupRoleDto tgroupRoleDto) throws Exception{
		tgroupRoleDao.insert(tgroupRoleDto);
	}
	/**
	 * TgroupRole批量插入数据
	 * @param tgroupRoleDtoList
	 * @return String
	 */
	@Transactional
	public void insert(List<TgroupRoleDto> tgroupRoleDtoList) throws Exception{
		tgroupRoleDao.insert(tgroupRoleDtoList);
	}
	/**
	 * 获取TgroupRole根据主键获取
	 * @param tgroupRoleDto
	 * @return Map
	 */
	public TgroupRoleDto findByPrimaryKey(TgroupRoleDto tgroupRoleDto) throws Exception{
		return tgroupRoleDao.findByPrimaryKey(tgroupRoleDto);
	}
	/**
	 * TgroupRole列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception{
		return tgroupRoleDao.findPage(pageIno);
	}
	/**
	 * TgroupRole列表信息
	 * @param tgroupRoleDto)
	 * @return List<TgroupRoleDto>
	 */
	public List<TgroupRoleDto> findList(TgroupRoleDto tgroupRoleDto) throws Exception{
		return tgroupRoleDao.findList(tgroupRoleDto);
	}
	/**
	 * 删除单条
	 * @param tgroupRoleDto
	 * @return 
	 */
	public int delete(TgroupRoleDto tgroupRoleDto) throws Exception{
		return tgroupRoleDao.delete(tgroupRoleDto);
	}
	@Transactional
	public int delete(List<TgroupRoleDto> tgroupRoleDtoList) throws Exception{
		return tgroupRoleDao.delete(tgroupRoleDtoList);
	}
	/**
	 * 修改
	 * @param tgroupRoleDto
	 * @return String
	 */
	public int update(TgroupRoleDto tgroupRoleDto) throws Exception{
		return  tgroupRoleDao.update(tgroupRoleDto);
	}
	@Transactional
	public long update(List<TgroupRoleDto> tgroupRoleDtoList) throws Exception{
		return  tgroupRoleDao.update(tgroupRoleDtoList);
	}
}
