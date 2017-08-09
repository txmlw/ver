package com.mrliang.ver.service.impl;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.mrliang.ver.dto.TgroupUserDto;
import com.mrliang.ver.dao.TgroupUserDao;
import com.mrliang.common.page.PageInfo;
import com.mrliang.ver.service.TgroupUserService;

@Component("tgroupUserService")
public class TgroupUserServiceImpl  implements TgroupUserService {
	public TgroupUserDao tgroupUserDao;
	
	@Autowired
	public void setTgroupUserDao(TgroupUserDao tgroupUserDao) {
		this.tgroupUserDao = tgroupUserDao;
	}
	/**
	 * TgroupUser插入一条数据
	 * @param tgroupUserDto
	 * @return String
	 */
	public void insert(TgroupUserDto tgroupUserDto) throws Exception{
		tgroupUserDao.insert(tgroupUserDto);
	}
	/**
	 * TgroupUser批量插入数据
	 * @param tgroupUserDtoList
	 * @return String
	 */
	@Transactional
	public void insert(List<TgroupUserDto> tgroupUserDtoList) throws Exception{
		tgroupUserDao.insert(tgroupUserDtoList);
	}
	/**
	 * 获取TgroupUser根据主键获取
	 * @param tgroupUserDto
	 * @return Map
	 */
	public TgroupUserDto findByPrimaryKey(TgroupUserDto tgroupUserDto) throws Exception{
		return tgroupUserDao.findByPrimaryKey(tgroupUserDto);
	}
	/**
	 * TgroupUser列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception{
		return tgroupUserDao.findPage(pageIno);
	}
	/**
	 * TgroupUser列表信息
	 * @param tgroupUserDto)
	 * @return List<TgroupUserDto>
	 */
	public List<TgroupUserDto> findList(TgroupUserDto tgroupUserDto) throws Exception{
		return tgroupUserDao.findList(tgroupUserDto);
	}
	/**
	 * 删除单条
	 * @param tgroupUserDto
	 * @return 
	 */
	public int delete(TgroupUserDto tgroupUserDto) throws Exception{
		return tgroupUserDao.delete(tgroupUserDto);
	}
	@Transactional
	public int delete(List<TgroupUserDto> tgroupUserDtoList) throws Exception{
		return tgroupUserDao.delete(tgroupUserDtoList);
	}
	/**
	 * 修改
	 * @param tgroupUserDto
	 * @return String
	 */
	public int update(TgroupUserDto tgroupUserDto) throws Exception{
		return  tgroupUserDao.update(tgroupUserDto);
	}
	@Transactional
	public long update(List<TgroupUserDto> tgroupUserDtoList) throws Exception{
		return  tgroupUserDao.update(tgroupUserDtoList);
	}
}
