package com.gouminger.mars.account.server.api;

import com.gouminger.mars.account.contract.AccountInfoContract;
import com.gouminger.mars.account.contract.model.AccountInfo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("accountInfo")
public class AccountInfoApi implements AccountInfoContract {

    @Override
    @PostMapping("create")
    public AccountInfo create(@RequestBody AccountInfo accountInfo) {
        return null;
    }

    @Override
    @PostMapping("update")
    public AccountInfo update(@RequestBody AccountInfo accountInfo) {
        return null;
    }

    @Override
    @GetMapping("get")
    public AccountInfo get(@RequestParam("userId") Long userId) {
        return null;
    }

}
