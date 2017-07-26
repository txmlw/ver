
package com.mrliang.ver.controller;

import com.alibaba.fastjson.JSON;
import com.mrliang.common.page.PageInfo;
import com.mrliang.ver.common.PageData;
import com.mrliang.ver.dto.TconfigDto;
import com.mrliang.ver.service.TconfigService;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@RestController
public class TconfigController{
	//默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null; 
	
	private TconfigService tconfigService;
	
	private final String LIST_ACTION = "redirect:/tconfig/";

	/** 查询条件录入界面 */
	@RequestMapping("/test")
	public String test(int a,int b) {
		return "1111";
	}
	/** 
	 * 增加setXXXX()方法,
	 **/
	@Resource(name="tconfigService")
	public void setTconfigService(TconfigService tconfigService) {
		this.tconfigService = tconfigService;
	}
	   
	/**
	 * 增加了@ModelAttribute的方法可以在本controller方法调用前执行,可以存放一些共享变量,如枚举值,或是一些初始化操作
	 */
	@ModelAttribute
	public void init(ModelMap model) {
		model.put("nowTimeStr", new java.sql.Timestamp(System.currentTimeMillis()));
	}
	/** 查询条件录入界面 */
	@RequestMapping("/queryInput")
	public String queryInput(ModelMap model,HttpServletRequest request,HttpServletResponse response,TconfigDto tconfigDto) {
		return "/tconfig/tconfigQueryInput";
	}
	/** 列表 */
	@RequestMapping("/queryList")
	public String queryList(ModelMap model,TconfigDto tconfigDto,PageInfo pageInfo) {
		try {
			pageInfo.setCondition(tconfigDto);
			pageInfo = tconfigService.findPage(pageInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.put("PageInfo", pageInfo);
		return "/tconfig/tconfigQueryList";
	}
	@RequestMapping(value="/queryListJson",method = RequestMethod.POST)
	public @ResponseBody PageData queryListJson(@RequestBody PageInfo pageInfo) throws Exception{
		PageData pageData = new PageData();
		try {
			pageData = PageData.fillPageInfo(tconfigService.findPage(pageInfo));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pageData;
	}

	/** 进入新增 */
	@RequestMapping(value="/add")
	public String add(ModelMap model,TconfigDto tconfigDto,HttpServletRequest request,HttpServletResponse response) throws Exception {
		model.addAttribute("tconfig",tconfigDto);
		return "/tconfig/tconfigAdd";
	}
	
	/** 保存新增,@Valid标注spirng在绑定对象时自动为我们验证对象属性并存放errors在BindingResult  */
	@RequestMapping(method=RequestMethod.POST)
	public String save(ModelMap model,TconfigDto tconfig,BindingResult errors) throws Exception {
		if(errors.hasErrors()) {
			return  "/tconfig/new";
		}
		tconfigService.insert(tconfig);
		return LIST_ACTION;
	}
	
	/** findByPrimaryKey */
	@RequestMapping(value="/findOne")
	public String findByPrimaryKey(ModelMap model,TconfigDto tconfigDto) throws Exception {
		TconfigDto tconfig = (TconfigDto)tconfigService.findByPrimaryKey(tconfigDto);
		model.addAttribute("tconfigDto",tconfigDto);
		return "/tconfig/edit";
	}
	
	/** 编辑 */
	@RequestMapping(value="/modify")
	public String modify(ModelMap model,TconfigDto tconfigDto) throws Exception {
		TconfigDto tconfig = (TconfigDto)tconfigService.findByPrimaryKey(tconfigDto);
		model.addAttribute("tconfigDto",tconfigDto);
		return "/tconfig/modify";
	}
	
	/** 保存更新,@Valid标注spirng在绑定对象时自动为我们验证对象属性并存放errors在BindingResult  */
	@RequestMapping("/update")
	public String update(ModelMap model,TconfigDto tconfigDto) throws Exception {
		tconfigService.update(tconfigDto);
		return LIST_ACTION;
	}
	
	/** 删除 */
	@RequestMapping("delete")
	public String delete(ModelMap model,TconfigDto tconfigDto) {
		try {
			tconfigService.delete(tconfigDto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return LIST_ACTION;
	}

	/** 批量删除 */
	@RequestMapping("/deletes")
	public String batchDelete(ModelMap model,List<TconfigDto> tconfiglist) {
		try {
			tconfigService.delete(tconfiglist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return LIST_ACTION;
	}

	public static void main(String[] args) {
		PageInfo tc = new PageInfo();
		TconfigDto t = new TconfigDto();
		//t.setPcode("SVN_USER");
		tc.setCondition(t);
		System.out.println( JSON.toJSONString(tc));
	}
}

