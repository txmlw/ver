package com.mrliang.ver.service.impl;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.mrliang.ver.dto.TresourceDto;
import com.mrliang.ver.dao.TresourceDao;
import com.mrliang.common.page.PageInfo;
import com.mrliang.ver.service.TresourceService;

@Component("tresourceService")
public class TresourceServiceImpl  implements TresourceService {
	public TresourceDao tresourceDao;
	
	@Autowired
	public void setTresourceDao(TresourceDao tresourceDao) {
		this.tresourceDao = tresourceDao;
	}
	/**
	 * Tresource插入一条数据
	 * @param tresourceDto
	 * @return String
	 */
	public void insert(TresourceDto tresourceDto) throws Exception{
		tresourceDao.insert(tresourceDto);
	}
	/**
	 * Tresource批量插入数据
	 * @param tresourceDtoList
	 * @return String
	 */
	@Transactional
	public void insert(List<TresourceDto> tresourceDtoList) throws Exception{
		tresourceDao.insert(tresourceDtoList);
	}
	/**
	 * 获取Tresource根据主键获取
	 * @param tresourceDto
	 * @return Map
	 */
	public TresourceDto findByPrimaryKey(TresourceDto tresourceDto) throws Exception{
		return tresourceDao.findByPrimaryKey(tresourceDto);
	}
	/**
	 * Tresource列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception{
		return tresourceDao.findPage(pageIno);
	}
	/**
	 * Tresource列表信息
	 * @param tresourceDto)
	 * @return List<TresourceDto>
	 */
	public List<TresourceDto> findList(TresourceDto tresourceDto) throws Exception{
		return tresourceDao.findList(tresourceDto);
	}
	/**
	 * 删除单条
	 * @param tresourceDto
	 * @return 
	 */
	public int delete(TresourceDto tresourceDto) throws Exception{
		return tresourceDao.delete(tresourceDto);
	}
	@Transactional
	public int delete(List<TresourceDto> tresourceDtoList) throws Exception{
		return tresourceDao.delete(tresourceDtoList);
	}
	/**
	 * 修改
	 * @param tresourceDto
	 * @return String
	 */
	public int update(TresourceDto tresourceDto) throws Exception{
		return  tresourceDao.update(tresourceDto);
	}
	@Transactional
	public long update(List<TresourceDto> tresourceDtoList) throws Exception{
		return  tresourceDao.update(tresourceDtoList);
	}
}
