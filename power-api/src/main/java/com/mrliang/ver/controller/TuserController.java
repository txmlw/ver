
package com.mrliang.ver.controller;

import com.mrliang.common.dto.ResponseDto;
import com.mrliang.common.page.PageInfo;
import com.mrliang.ver.dto.TuserDto;
import com.mrliang.ver.service.TuserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 284355163@qq.com
 * @version 1.0
 * @since 1.0
 */

@RestController
@RequestMapping("/tuser")
public class TuserController{
	
	private TuserService tuserService;
	
	/** 
	 * tuserService 注入
	 **/
	@Resource(name="tuserService")
	public void setTuserService(TuserService tuserService) {
		this.tuserService = tuserService;
	}
	   
	@RequestMapping(value="/paged",method = RequestMethod.POST)
	public ResponseDto paged(@RequestBody PageInfo pageInfo) throws Exception{
		return ResponseDto.fillPageInfo(tuserService.findPage(pageInfo));
	}

	/** 新增保存 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ResponseDto add(@RequestBody TuserDto tuserDto) throws Exception {
		tuserService.insert(tuserDto);
		return new ResponseDto();
	}
	/** 登录处理 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ResponseDto login(@RequestBody TuserDto tuserDto) throws Exception {
		System.out.println("---------------------------------");
		ResponseDto responseDto = new ResponseDto();
		String checkResult = tuserService.checkUserLogin(tuserDto);
		if(!"ok".equals(checkResult)){
			responseDto.initError(new RuntimeException("登录失败"));
			responseDto.setResultMsg(checkResult);
		}
		return responseDto;
	}
	/** 按主键查询 */
	@RequestMapping(value="/findOne",method=RequestMethod.POST)
	public ResponseDto findByPrimaryKey(@RequestBody TuserDto tuserDto) throws Exception {
		TuserDto tuser = (TuserDto)tuserService.findByPrimaryKey(tuserDto);
		ResponseDto responseDto = new ResponseDto();
		List data = new ArrayList();
		data.add(tuser);
		responseDto.setData(data);
		return responseDto;
	}
	
	/** 修改保存 */
	@RequestMapping(value="/editSave",method=RequestMethod.POST)
	public ResponseDto edit(@RequestBody TuserDto tuserDto) throws Exception {
		int n = tuserService.update(tuserDto);
		return new ResponseDto();
	}
	
	/** 删除 */
	@RequestMapping("delete")
	public ResponseDto delete(@RequestBody TuserDto tuserDto) throws Exception {
		tuserService.delete(tuserDto);
		return new ResponseDto();
	}

	/** 批量删除 */
	@RequestMapping("/deletes")
	public ResponseDto batchDelete(@RequestBody List<TuserDto> tuserlist) throws Exception {
		tuserService.delete(tuserlist);
		return new ResponseDto();
	}
	
}

