package com.mrliang.ver.service.impl;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.mrliang.ver.dto.TuserRoleDto;
import com.mrliang.ver.dao.TuserRoleDao;
import com.mrliang.common.page.PageInfo;
import com.mrliang.ver.service.TuserRoleService;

@Component("tuserRoleService")
public class TuserRoleServiceImpl  implements TuserRoleService {
	public TuserRoleDao tuserRoleDao;
	
	@Autowired
	public void setTuserRoleDao(TuserRoleDao tuserRoleDao) {
		this.tuserRoleDao = tuserRoleDao;
	}
	/**
	 * TuserRole插入一条数据
	 * @param tuserRoleDto
	 * @return String
	 */
	public void insert(TuserRoleDto tuserRoleDto) throws Exception{
		tuserRoleDao.insert(tuserRoleDto);
	}
	/**
	 * TuserRole批量插入数据
	 * @param tuserRoleDtoList
	 * @return String
	 */
	@Transactional
	public void insert(List<TuserRoleDto> tuserRoleDtoList) throws Exception{
		tuserRoleDao.insert(tuserRoleDtoList);
	}
	/**
	 * 获取TuserRole根据主键获取
	 * @param tuserRoleDto
	 * @return Map
	 */
	public TuserRoleDto findByPrimaryKey(TuserRoleDto tuserRoleDto) throws Exception{
		return tuserRoleDao.findByPrimaryKey(tuserRoleDto);
	}
	/**
	 * TuserRole列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception{
		return tuserRoleDao.findPage(pageIno);
	}
	/**
	 * TuserRole列表信息
	 * @param tuserRoleDto)
	 * @return List<TuserRoleDto>
	 */
	public List<TuserRoleDto> findList(TuserRoleDto tuserRoleDto) throws Exception{
		return tuserRoleDao.findList(tuserRoleDto);
	}
	/**
	 * 删除单条
	 * @param tuserRoleDto
	 * @return 
	 */
	public int delete(TuserRoleDto tuserRoleDto) throws Exception{
		return tuserRoleDao.delete(tuserRoleDto);
	}
	@Transactional
	public int delete(List<TuserRoleDto> tuserRoleDtoList) throws Exception{
		return tuserRoleDao.delete(tuserRoleDtoList);
	}
	/**
	 * 修改
	 * @param tuserRoleDto
	 * @return String
	 */
	public int update(TuserRoleDto tuserRoleDto) throws Exception{
		return  tuserRoleDao.update(tuserRoleDto);
	}
	@Transactional
	public long update(List<TuserRoleDto> tuserRoleDtoList) throws Exception{
		return  tuserRoleDao.update(tuserRoleDtoList);
	}
}
