package com.gouminger.mars.admin.contract;

import com.gouminger.mars.admin.contract.model.AdminInfo;

public interface AdminInfoContract {

    AdminInfo create (AdminInfo adminInfo);

    AdminInfo update (AdminInfo adminInfo);

    AdminInfo get (Long id);

}
