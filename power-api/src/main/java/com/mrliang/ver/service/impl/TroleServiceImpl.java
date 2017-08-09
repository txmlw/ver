package com.mrliang.ver.service.impl;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.mrliang.ver.dto.TroleDto;
import com.mrliang.ver.dao.TroleDao;
import com.mrliang.common.page.PageInfo;
import com.mrliang.ver.service.TroleService;

@Component("troleService")
public class TroleServiceImpl  implements TroleService {
	public TroleDao troleDao;
	
	@Autowired
	public void setTroleDao(TroleDao troleDao) {
		this.troleDao = troleDao;
	}
	/**
	 * Trole插入一条数据
	 * @param troleDto
	 * @return String
	 */
	public void insert(TroleDto troleDto) throws Exception{
		troleDao.insert(troleDto);
	}
	/**
	 * Trole批量插入数据
	 * @param troleDtoList
	 * @return String
	 */
	@Transactional
	public void insert(List<TroleDto> troleDtoList) throws Exception{
		troleDao.insert(troleDtoList);
	}
	/**
	 * 获取Trole根据主键获取
	 * @param troleDto
	 * @return Map
	 */
	public TroleDto findByPrimaryKey(TroleDto troleDto) throws Exception{
		return troleDao.findByPrimaryKey(troleDto);
	}
	/**
	 * Trole列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception{
		return troleDao.findPage(pageIno);
	}
	/**
	 * Trole列表信息
	 * @param troleDto)
	 * @return List<TroleDto>
	 */
	public List<TroleDto> findList(TroleDto troleDto) throws Exception{
		return troleDao.findList(troleDto);
	}
	/**
	 * 删除单条
	 * @param troleDto
	 * @return 
	 */
	public int delete(TroleDto troleDto) throws Exception{
		return troleDao.delete(troleDto);
	}
	@Transactional
	public int delete(List<TroleDto> troleDtoList) throws Exception{
		return troleDao.delete(troleDtoList);
	}
	/**
	 * 修改
	 * @param troleDto
	 * @return String
	 */
	public int update(TroleDto troleDto) throws Exception{
		return  troleDao.update(troleDto);
	}
	@Transactional
	public long update(List<TroleDto> troleDtoList) throws Exception{
		return  troleDao.update(troleDtoList);
	}
}
