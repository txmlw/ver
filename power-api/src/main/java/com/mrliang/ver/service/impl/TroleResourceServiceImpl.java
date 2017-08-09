package com.mrliang.ver.service.impl;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.mrliang.ver.dto.TroleResourceDto;
import com.mrliang.ver.dao.TroleResourceDao;
import com.mrliang.common.page.PageInfo;
import com.mrliang.ver.service.TroleResourceService;

@Component("troleResourceService")
public class TroleResourceServiceImpl  implements TroleResourceService {
	public TroleResourceDao troleResourceDao;
	
	@Autowired
	public void setTroleResourceDao(TroleResourceDao troleResourceDao) {
		this.troleResourceDao = troleResourceDao;
	}
	/**
	 * TroleResource插入一条数据
	 * @param troleResourceDto
	 * @return String
	 */
	public void insert(TroleResourceDto troleResourceDto) throws Exception{
		troleResourceDao.insert(troleResourceDto);
	}
	/**
	 * TroleResource批量插入数据
	 * @param troleResourceDtoList
	 * @return String
	 */
	@Transactional
	public void insert(List<TroleResourceDto> troleResourceDtoList) throws Exception{
		troleResourceDao.insert(troleResourceDtoList);
	}
	/**
	 * 获取TroleResource根据主键获取
	 * @param troleResourceDto
	 * @return Map
	 */
	public TroleResourceDto findByPrimaryKey(TroleResourceDto troleResourceDto) throws Exception{
		return troleResourceDao.findByPrimaryKey(troleResourceDto);
	}
	/**
	 * TroleResource列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception{
		return troleResourceDao.findPage(pageIno);
	}
	/**
	 * TroleResource列表信息
	 * @param troleResourceDto)
	 * @return List<TroleResourceDto>
	 */
	public List<TroleResourceDto> findList(TroleResourceDto troleResourceDto) throws Exception{
		return troleResourceDao.findList(troleResourceDto);
	}
	/**
	 * 删除单条
	 * @param troleResourceDto
	 * @return 
	 */
	public int delete(TroleResourceDto troleResourceDto) throws Exception{
		return troleResourceDao.delete(troleResourceDto);
	}
	@Transactional
	public int delete(List<TroleResourceDto> troleResourceDtoList) throws Exception{
		return troleResourceDao.delete(troleResourceDtoList);
	}
	/**
	 * 修改
	 * @param troleResourceDto
	 * @return String
	 */
	public int update(TroleResourceDto troleResourceDto) throws Exception{
		return  troleResourceDao.update(troleResourceDto);
	}
	@Transactional
	public long update(List<TroleResourceDto> troleResourceDtoList) throws Exception{
		return  troleResourceDao.update(troleResourceDtoList);
	}
}
