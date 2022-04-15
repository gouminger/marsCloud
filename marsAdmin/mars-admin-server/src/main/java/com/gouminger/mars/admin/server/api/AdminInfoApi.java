package com.gouminger.mars.admin.server.api;

import com.gouminger.mars.admin.contract.AdminInfoContract;
import com.gouminger.mars.admin.contract.model.AdminInfo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("adminInfo")
public class AdminInfoApi implements AdminInfoContract {

    @Override
    @PostMapping("create")
    public AdminInfo create(@RequestBody AdminInfo adminInfo) {
        return null;
    }

    @Override
    @PostMapping("update")
    public AdminInfo update(@RequestBody AdminInfo adminInfo) {
        return null;
    }

    @Override
    @GetMapping("get")
    public AdminInfo get(@RequestParam("id") Long id) {
        return null;
    }

}
