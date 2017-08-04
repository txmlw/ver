package com.mrliang.ver.service.impl;

import com.mrliang.common.page.PageInfo;
import com.mrliang.ver.dao.TconfigDao;
import com.mrliang.ver.dto.TconfigDto;
import com.mrliang.ver.service.TconfigService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Component("tconfigService")
public class TconfigServiceImpl  implements TconfigService {
	public TconfigDao tconfigDao;
	@Autowired
	public void setTconfigDao(TconfigDao tconfigDao) {
		this.tconfigDao = tconfigDao;
	}
	/**
	 * Tconfig插入一条数据
	 * @param tconfigDto
	 * @return String
	 */
	public void insert(TconfigDto tconfigDto) throws Exception{
		tconfigDao.insert(tconfigDto);
	}
	/**
	 * Tconfig批量插入数据
	 * @param tconfigDtoList
	 * @return String
	 */
	@Transactional
	public void insert(List<TconfigDto> tconfigDtoList) throws Exception{
		tconfigDao.insert(tconfigDtoList);
	}
	/**
	 * 获取Tconfig根据主键获取
	 * @param tconfigDto
	 * @return Map
	 */
	public TconfigDto findByPrimaryKey(TconfigDto tconfigDto) throws Exception{
		return tconfigDao.findByPrimaryKey(tconfigDto);
	}
	/**
	 * Tconfig列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception{
		return tconfigDao.findPage(pageIno);
	}
	/**
	 * 删除单条
	 * @param tconfigDto
	 * @return 
	 */
	public int delete(TconfigDto tconfigDto) throws Exception{
		return tconfigDao.delete(tconfigDto);
	}
	@Transactional
	public int delete(List<TconfigDto> tconfigDtoList) throws Exception{
		return tconfigDao.delete(tconfigDtoList);
	}
	/**
	 * 修改
	 * @param tconfigDto
	 * @return String
	 */
	public int update(TconfigDto tconfigDto) throws Exception {
		return tconfigDao.update( tconfigDto );
	}
	@Transactional
	public long update(List<TconfigDto> tconfigDtoList) throws Exception{
		return  tconfigDao.update(tconfigDtoList);
	}
}
