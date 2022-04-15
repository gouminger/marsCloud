package com.gouminger.mars.user.server.api;

import com.gouminger.mars.user.contract.UserInfoContract;
import com.gouminger.mars.user.contract.model.UserInfo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("userInfo")
public class UserInfoApi implements UserInfoContract {
    @Override
    @PostMapping("create")
    public UserInfo create(@RequestBody UserInfo userInfo) {
        return null;
    }

    @Override
    @PostMapping("update")
    public UserInfo update(@RequestBody UserInfo userInfo) {
        return null;
    }

    @Override
    @GetMapping("get")
    public UserInfo get(@RequestParam("mobile") String mobile, @RequestParam("password") String password) {
        return null;
    }
}
