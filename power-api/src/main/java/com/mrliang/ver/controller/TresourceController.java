
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
@RequestMapping("/tresource")
public class TresourceController{
	
	private TresourceService tresourceService;
	
	/** 
	 * tresourceService 注入
	 **/
	@Resource(name="tresourceService")
	public void setTresourceService(TresourceService tresourceService) {
		this.tresourceService = tresourceService;
	}
	   
	@RequestMapping(value="/paged",method = RequestMethod.POST)
	public ResponseDto paged(@RequestBody PageInfo pageInfo) throws Exception{
		return ResponseDto.fillPageInfo(tresourceService.findPage(pageInfo));
	}

	/** 新增保存 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ResponseDto add(@RequestBody TresourceDto tresourceDto) throws Exception {
		tresourceService.insert(tresourceDto);
		return new ResponseDto();
	}
	
	/** 按主键查询 */
	@RequestMapping(value="/findOne",method=RequestMethod.POST)
	public ResponseDto findByPrimaryKey(@RequestBody TresourceDto tresourceDto) throws Exception {
		TresourceDto tresource = (TresourceDto)tresourceService.findByPrimaryKey(tresourceDto);
		ResponseDto responseDto = new ResponseDto();
		List data = new ArrayList();
		data.add(tresource);
		responseDto.setData(data);
		return responseDto;
	}
	
	/** 修改保存 */
	@RequestMapping(value="/editSave",method=RequestMethod.POST)
	public ResponseDto edit(@RequestBody TresourceDto tresourceDto) throws Exception {
		int n = tresourceService.update(tresourceDto);
		return new ResponseDto();
	}
	
	/** 删除 */
	@RequestMapping("delete")
	public ResponseDto delete(@RequestBody TresourceDto tresourceDto) throws Exception {
		tresourceService.delete(tresourceDto);
		return new ResponseDto();
	}

	/** 批量删除 */
	@RequestMapping("/deletes")
	public ResponseDto batchDelete(@RequestBody List<TresourceDto> tresourcelist) throws Exception {
		tresourceService.delete(tresourcelist);
		return new ResponseDto();
	}
	
}

