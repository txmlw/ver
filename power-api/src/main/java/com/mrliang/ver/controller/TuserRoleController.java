
package com.mrliang.ver.controller;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mrliang.common.page.PageInfo;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import com.mrliang.common.dto.ResponseDto;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

import java.util.*;
import com.mrliang.ver.dto.*;
import com.mrliang.ver.dao.*;
import com.mrliang.ver.service.*;

/**
 * @author 284355163@qq.com
 * @version 1.0
 * @since 1.0
 */

@RestController
@RequestMapping("/tuserrole")
public class TuserRoleController{
	
	private TuserRoleService tuserRoleService;
	
	/** 
	 * tuserRoleService 注入
	 **/
	@Resource(name="tuserRoleService")
	public void setTuserRoleService(TuserRoleService tuserRoleService) {
		this.tuserRoleService = tuserRoleService;
	}
	   
	@RequestMapping(value="/paged",method = RequestMethod.POST)
	public ResponseDto paged(@RequestBody PageInfo pageInfo) throws Exception{
		return ResponseDto.fillPageInfo(tuserRoleService.findPage(pageInfo));
	}

	/** 新增保存 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ResponseDto add(@RequestBody TuserRoleDto tuserRoleDto) throws Exception {
		tuserRoleService.insert(tuserRoleDto);
		return new ResponseDto();
	}
	
	/** 按主键查询 */
	@RequestMapping(value="/findOne",method=RequestMethod.POST)
	public ResponseDto findByPrimaryKey(@RequestBody TuserRoleDto tuserRoleDto) throws Exception {
		TuserRoleDto tuserRole = (TuserRoleDto)tuserRoleService.findByPrimaryKey(tuserRoleDto);
		ResponseDto responseDto = new ResponseDto();
		List data = new ArrayList();
		data.add(tuserRole);
		responseDto.setData(data);
		return responseDto;
	}
	
	/** 修改保存 */
	@RequestMapping(value="/editSave",method=RequestMethod.POST)
	public ResponseDto edit(@RequestBody TuserRoleDto tuserRoleDto) throws Exception {
		int n = tuserRoleService.update(tuserRoleDto);
		return new ResponseDto();
	}
	
	/** 删除 */
	@RequestMapping("delete")
	public ResponseDto delete(@RequestBody TuserRoleDto tuserRoleDto) throws Exception {
		tuserRoleService.delete(tuserRoleDto);
		return new ResponseDto();
	}

	/** 批量删除 */
	@RequestMapping("/deletes")
	public ResponseDto batchDelete(@RequestBody List<TuserRoleDto> tuserRolelist) throws Exception {
		tuserRoleService.delete(tuserRolelist);
		return new ResponseDto();
	}
	
}

