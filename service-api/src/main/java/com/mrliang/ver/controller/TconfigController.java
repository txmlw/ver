
package com.mrliang.ver.controller;

import com.mrliang.common.page.PageInfo;
import com.mrliang.ver.common.ResponseData;
import com.mrliang.ver.dto.TconfigDto;
import com.mrliang.ver.service.TconfigService;
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
@RequestMapping("/tconfig")
public class TconfigController{
	
	private TconfigService tconfigService;
	
	/** 
	 * tconfigService 注入
	 **/
	@Resource(name="tconfigService")
	public void setTconfigService(TconfigService tconfigService) {
		this.tconfigService = tconfigService;
	}
	   
	@RequestMapping(value="/queryList",method = RequestMethod.POST)
	public ResponseData queryListJson(@RequestBody PageInfo pageInfo) throws Exception{
		ResponseData responseData = new ResponseData();
		try {
			responseData = ResponseData.fillPageInfo(tconfigService.findPage(pageInfo));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseData;
	}

	/** 新增保存 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ResponseData add(@RequestBody TconfigDto tconfigDto) throws Exception {
		tconfigService.insert(tconfigDto);
		return new ResponseData();
	}
	
	/** 按主键查询 */
	@RequestMapping(value="/findOne",method=RequestMethod.POST)
	public ResponseData findByPrimaryKey(@RequestBody TconfigDto tconfigDto) throws Exception {
		TconfigDto tconfig = (TconfigDto)tconfigService.findByPrimaryKey(tconfigDto);
		ResponseData responseData = new ResponseData();
		List data = new ArrayList();
		data.add(tconfig);
		responseData.setData(data);
		return responseData;
	}
	
	/** 修改保存 */
	@RequestMapping(value="/editSave",method=RequestMethod.POST)
	public ResponseData edit(@RequestBody TconfigDto tconfigDto) throws Exception {
		int n = tconfigService.update(tconfigDto);
		return new ResponseData();
	}
	
	/** 删除 */
	@RequestMapping("delete")
	public ResponseData delete(@RequestBody TconfigDto tconfigDto) throws Exception {
		tconfigService.delete(tconfigDto);
		return new ResponseData();
	}

	/** 批量删除 */
	@RequestMapping("/deletes")
	public ResponseData batchDelete(@RequestBody List<TconfigDto> tconfiglist) throws Exception {
		tconfigService.delete(tconfiglist);
		return new ResponseData();
	}
	
}

