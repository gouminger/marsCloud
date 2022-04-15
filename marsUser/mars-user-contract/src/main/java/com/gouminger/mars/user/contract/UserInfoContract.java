package com.gouminger.mars.user.contract;

import com.gouminger.mars.user.contract.model.UserInfo;

public interface UserInfoContract {

    UserInfo create (UserInfo userInfo);

    UserInfo update (UserInfo userInfo);

    UserInfo get (String mobile, String password);

}
