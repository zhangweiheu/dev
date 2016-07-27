package com.online.controller.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangwei on 16/1/25.
 */
@RestController
@RequestMapping("/api/user")
public class UserApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserApiController.class);

//    @Autowired
//    UserService userService;
//
//
//    @RequestMapping(value = "/{uid}", method = RequestMethod.GET)
//    public JsonResponse getUserById(@PathVariable("uid") int uid) {
//        if (!checkprivilege(uid)) {
//            return JsonResponse.failed();
//        }
//        User user = userService.findUserByUid(uid);
//        user.setPassword(null);
//        return JsonResponse.success(user);
//    }

}
