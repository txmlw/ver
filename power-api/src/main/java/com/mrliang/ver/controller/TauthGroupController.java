
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
@RequestMapping("/tauthgroup")
public class TauthGroupController{
	
	private TauthGroupService tauthGroupService;
	
	/** 
	 * tauthGroupService 注入
	 **/
	@Resource(name="tauthGroupService")
	public void setTauthGroupService(TauthGroupService tauthGroupService) {
		this.tauthGroupService = tauthGroupService;
	}
	   
	@RequestMapping(value="/paged",method = RequestMethod.POST)
	public ResponseDto paged(@RequestBody PageInfo pageInfo) throws Exception{
		return ResponseDto.fillPageInfo(tauthGroupService.findPage(pageInfo));
	}

	/** 新增保存 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ResponseDto add(@RequestBody TauthGroupDto tauthGroupDto) throws Exception {
		tauthGroupService.insert(tauthGroupDto);
		return new ResponseDto();
	}
	
	/** 按主键查询 */
	@RequestMapping(value="/findOne",method=RequestMethod.POST)
	public ResponseDto findByPrimaryKey(@RequestBody TauthGroupDto tauthGroupDto) throws Exception {
		TauthGroupDto tauthGroup = (TauthGroupDto)tauthGroupService.findByPrimaryKey(tauthGroupDto);
		ResponseDto responseDto = new ResponseDto();
		List data = new ArrayList();
		data.add(tauthGroup);
		responseDto.setData(data);
		return responseDto;
	}
	
	/** 修改保存 */
	@RequestMapping(value="/editSave",method=RequestMethod.POST)
	public ResponseDto edit(@RequestBody TauthGroupDto tauthGroupDto) throws Exception {
		int n = tauthGroupService.update(tauthGroupDto);
		return new ResponseDto();
	}
	
	/** 删除 */
	@RequestMapping("delete")
	public ResponseDto delete(@RequestBody TauthGroupDto tauthGroupDto) throws Exception {
		tauthGroupService.delete(tauthGroupDto);
		return new ResponseDto();
	}

	/** 批量删除 */
	@RequestMapping("/deletes")
	public ResponseDto batchDelete(@RequestBody List<TauthGroupDto> tauthGrouplist) throws Exception {
		tauthGroupService.delete(tauthGrouplist);
		return new ResponseDto();
	}
	
}

