package com.mrliang.ver.service.impl;

import com.mrliang.common.page.PageInfo;
import com.mrliang.ver.dao.TuserDao;
import com.mrliang.ver.dto.TuserDto;
import com.mrliang.ver.service.TuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.util.List;

@Component("tuserService")
public class TuserServiceImpl  implements TuserService {
	public TuserDao tuserDao;
	
	@Autowired
	public void setTuserDao(TuserDao tuserDao) {
		this.tuserDao = tuserDao;
	}
	/**
	 * Tuser插入一条数据
	 * @param tuserDto
	 * @return String
	 */
	public void insert(TuserDto tuserDto) throws Exception{
		tuserDao.insert(tuserDto);
	}
	/**
	 * Tuser批量插入数据
	 * @param tuserDtoList
	 * @return String
	 */
	@Transactional
	public void insert(List<TuserDto> tuserDtoList) throws Exception{
		tuserDao.insert(tuserDtoList);
	}
	/**
	 * 获取Tuser根据主键获取
	 * @param tuserDto
	 * @return Map
	 */
	public TuserDto findByPrimaryKey(TuserDto tuserDto) throws Exception{
		return tuserDao.findByPrimaryKey(tuserDto);
	}
	/**
	 * Tuser列表信息
	 * @param pageIno
	 * @return List
	 */
	public PageInfo findPage(PageInfo pageIno) throws Exception{
		return tuserDao.findPage(pageIno);
	}
	/**
	 * Tuser列表信息
	 * @param tuserDto)
	 * @return List<TuserDto>
	 */
	public List<TuserDto> findList(TuserDto tuserDto) throws Exception{
		return tuserDao.findList(tuserDto);
	}
	/**
	 * 删除单条
	 * @param tuserDto
	 * @return 
	 */
	public int delete(TuserDto tuserDto) throws Exception{
		return tuserDao.delete(tuserDto);
	}
	@Transactional
	public int delete(List<TuserDto> tuserDtoList) throws Exception{
		return tuserDao.delete(tuserDtoList);
	}
	/**
	 * 修改
	 * @param tuserDto
	 * @return String
	 */
	public int update(TuserDto tuserDto) throws Exception{
		return  tuserDao.update(tuserDto);
	}
	@Transactional
	public long update(List<TuserDto> tuserDtoList) throws Exception{
		return  tuserDao.update(tuserDtoList);
	}

	@Override
	public String checkUserLogin(TuserDto tuserDto) throws Exception {
		String retMsg = "";
		TuserDto tuserQuery = new TuserDto();
		tuserQuery.setUsername(tuserDto.getUsername());
		List<TuserDto> list = tuserDao.findList(tuserQuery);
		if(null == list || list.size() == 0){
			retMsg = "用户不存在";
		}else {
			TuserDto user = list.get( 0 );
			if ("0".equals( user.getValid() )) {
				retMsg = "用户已注销";
			} else if (user.getPassword().equals( DigestUtils.md5DigestAsHex( tuserDto.getPassword().getBytes() ) )) {
				retMsg = "ok";
			}else{
				retMsg = "用户名或密码错误";
			}
		}
		return retMsg;
	}
}
