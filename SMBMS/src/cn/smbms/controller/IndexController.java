package cn.smbms.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import cn.smbms.pojo.User;

@Controller
public class IndexController{
	private Logger logger = Logger.getLogger(IndexController.class);
	
	@RequestMapping("/index")
	public String index(){
		logger.info("hello,SpringMVC!");
		return "index";
	}
	
}
