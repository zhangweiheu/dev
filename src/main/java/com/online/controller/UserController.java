package com.online.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhangwei on 16/1/25.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

//    @Autowired
//    UserService userService;
//
//    @RequestMapping(value = "", method = RequestMethod.GET)
//    public ModelAndView User() {
//        ModelAndView view = new ModelAndView();
//        UserVo userVo = new UserVo();
//        BeanUtils.copyProperties(UserHolder.getInstance().getUser(), userVo);
//        view.addObject(userVo);
//        view.setViewName("user");
//        return view;
//    }

}
