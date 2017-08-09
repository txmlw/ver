package com.mrliang.ver.service.impl;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.mrliang.ver.dto.TmenuDto;
import com.mrliang.ver.dao.TmenuDao;
import com.mrliang.common.page.PageInfo;
import com.mrliang.ver.service.TmenuService;

@Component("tmenuService")
public class TmenuServiceImpl  implements TmenuService {
	public TmenuDao tmenuDao;
	
	@Autowired
	public void setTmenuDao(TmenuDao tmenuDao) {
		this.tmenuDao = tmenuDao;
	}
	/**
	 * Tmenu插入一条数据
	 * @param tmenuDto
	 * @return String
	 */
	public void insert(TmenuDto tmenuDto) throws Exception{
		tmenuDao.insert(tmenuDto);
	}
	/**
	 * Tmenu批量插入数据
	 * @param tmenuDtoList
	 * @return String
	 */
	@Transactional
	public void insert(List<TmenuDto> tmenuDtoList) throws Exception{
		tmenuDao.insert(tmenuDtoList);
	}
	/**
	 * 获取Tmenu根据主键获取
	 * @param tmenuDto
	 * @return Map
	 */
	public TmenuDto findByPrimaryKey(TmenuDto tmenuDto) throws Exception{
		return tmenuDao.findByPrimaryKey(tmenuDto);
	}
	/**
	 * Tmenu列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception{
		return tmenuDao.findPage(pageIno);
	}
	/**
	 * Tmenu列表信息
	 * @param tmenuDto)
	 * @return List<TmenuDto>
	 */
	public List<TmenuDto> findList(TmenuDto tmenuDto) throws Exception{
		return tmenuDao.findList(tmenuDto);
	}
	/**
	 * 删除单条
	 * @param tmenuDto
	 * @return 
	 */
	public int delete(TmenuDto tmenuDto) throws Exception{
		return tmenuDao.delete(tmenuDto);
	}
	@Transactional
	public int delete(List<TmenuDto> tmenuDtoList) throws Exception{
		return tmenuDao.delete(tmenuDtoList);
	}
	/**
	 * 修改
	 * @param tmenuDto
	 * @return String
	 */
	public int update(TmenuDto tmenuDto) throws Exception{
		return  tmenuDao.update(tmenuDto);
	}
	@Transactional
	public long update(List<TmenuDto> tmenuDtoList) throws Exception{
		return  tmenuDao.update(tmenuDtoList);
	}
}
