package com.mrliang.ver.service.impl;

import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.mrliang.ver.dto.TuserGroupDto;
import com.mrliang.ver.dao.TuserGroupDao;
import com.mrliang.common.page.PageInfo;
import com.mrliang.ver.service.TuserGroupService;

@Component("tuserGroupService")
public class TuserGroupServiceImpl  implements TuserGroupService {
	public TuserGroupDao tuserGroupDao;
	
	@Autowired
	public void setTuserGroupDao(TuserGroupDao tuserGroupDao) {
		this.tuserGroupDao = tuserGroupDao;
	}
	/**
	 * TuserGroup插入一条数据
	 * @param tuserGroupDto
	 * @return String
	 */
	public void insert(TuserGroupDto tuserGroupDto) throws Exception{
		tuserGroupDao.insert(tuserGroupDto);
	}
	/**
	 * TuserGroup批量插入数据
	 * @param tuserGroupDtoList
	 * @return String
	 */
	@Transactional
	public void insert(List<TuserGroupDto> tuserGroupDtoList) throws Exception{
		tuserGroupDao.insert(tuserGroupDtoList);
	}
	/**
	 * 获取TuserGroup根据主键获取
	 * @param tuserGroupDto
	 * @return Map
	 */
	public TuserGroupDto findByPrimaryKey(TuserGroupDto tuserGroupDto) throws Exception{
		return tuserGroupDao.findByPrimaryKey(tuserGroupDto);
	}
	/**
	 * TuserGroup列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception{
		return tuserGroupDao.findPage(pageIno);
	}
	/**
	 * TuserGroup列表信息
	 * @param tuserGroupDto)
	 * @return List<TuserGroupDto>
	 */
	public List<TuserGroupDto> findList(TuserGroupDto tuserGroupDto) throws Exception{
		return tuserGroupDao.findList(tuserGroupDto);
	}
	/**
	 * 删除单条
	 * @param tuserGroupDto
	 * @return 
	 */
	public int delete(TuserGroupDto tuserGroupDto) throws Exception{
		return tuserGroupDao.delete(tuserGroupDto);
	}
	@Transactional
	public int delete(List<TuserGroupDto> tuserGroupDtoList) throws Exception{
		return tuserGroupDao.delete(tuserGroupDtoList);
	}
	/**
	 * 修改
	 * @param tuserGroupDto
	 * @return String
	 */
	public int update(TuserGroupDto tuserGroupDto) throws Exception{
		return  tuserGroupDao.update(tuserGroupDto);
	}
	@Transactional
	public long update(List<TuserGroupDto> tuserGroupDtoList) throws Exception{
		return  tuserGroupDao.update(tuserGroupDtoList);
	}
}
