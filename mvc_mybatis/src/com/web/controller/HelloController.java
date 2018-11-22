package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.po.User;
import com.web.service.UserService;

/**
 *
 * 类描述：
 *
 * @author zhao.gang
 * @date 2018年11月10日
 * 
 * 修改描述：
 * @modifier
 */
@Controller
public class HelloController {

    @Autowired
    private UserService userService;
    
    @RequestMapping("/hello") 
    public String hello(@RequestParam(value = "id", required = false, defaultValue = "1") int id,                        
                Model model) throws Exception {                  
            
            // 通过客户端传送过来的id获取user数据
            User user = userService.getUserById(id);
            
            if (user == null) {
                user = new User();
                user.setName("查无记录");
            }
            
            String myhtml = "<div><p>这是html文本。</p><p>红色字体表明css样式文件成功加载。</p><p>这说明jsp上的数据可以由后台控制并显示</P></div><p></P>";
            // 在jsp文件中，可以通过${myhtml}得到myhtml的内容
            model.addAttribute("myhtml", myhtml);
            
            model.addAttribute("name", user.getName());            
            
            // 这里去WEB-INF/jsp 中找hello.jsp；因为springmvc-servlet.xml中配置了前缀与后缀，
            // 所以，hello = WEB-INF/jsp/hello.jsp
            return "hello";
    }
}
