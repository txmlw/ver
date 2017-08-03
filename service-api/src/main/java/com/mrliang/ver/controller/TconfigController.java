
package com.mrliang.ver.controller;

import com.mrliang.common.dto.ResponseDto;
import com.mrliang.common.page.PageInfo;
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
	public ResponseDto queryListJson(@RequestBody PageInfo pageInfo) throws Exception{
		return ResponseDto.fillPageInfo(tconfigService.findPage(pageInfo));
	}

	/** 新增保存 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ResponseDto add(@RequestBody TconfigDto tconfigDto) throws Exception {
		tconfigService.insert(tconfigDto);
		return new ResponseDto();
	}
	
	/** 按主键查询 */
	@RequestMapping(value="/findOne",method=RequestMethod.POST)
	public ResponseDto findByPrimaryKey(@RequestBody TconfigDto tconfigDto) throws Exception {
		TconfigDto tconfig = (TconfigDto)tconfigService.findByPrimaryKey(tconfigDto);
		ResponseDto responseDto = new ResponseDto();
		List data = new ArrayList();
		data.add(tconfig);
		responseDto.setData(data);
		return responseDto;
	}
	
	/** 修改保存 */
	@RequestMapping(value="/editSave",method=RequestMethod.POST)
	public ResponseDto edit(@RequestBody TconfigDto tconfigDto) throws Exception {
		int n = tconfigService.update(tconfigDto);
		return new ResponseDto();
	}
	
	/** 删除 */
	@RequestMapping("delete")
	public ResponseDto delete(@RequestBody TconfigDto tconfigDto) throws Exception {
		tconfigService.delete(tconfigDto);
		return new ResponseDto();
	}

	/** 批量删除 */
	@RequestMapping("/deletes")
	public ResponseDto batchDelete(@RequestBody List<TconfigDto> tconfiglist) throws Exception {
		tconfigService.delete(tconfiglist);
		return new ResponseDto();
	}
	
}

