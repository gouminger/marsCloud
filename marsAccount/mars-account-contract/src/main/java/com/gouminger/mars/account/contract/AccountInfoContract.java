package com.gouminger.mars.account.contract;

import com.gouminger.mars.account.contract.model.AccountInfo;

public interface AccountInfoContract {

    AccountInfo create (AccountInfo accountInfo);

    AccountInfo update (AccountInfo accountInfo);

    AccountInfo get (Long userId);

}
