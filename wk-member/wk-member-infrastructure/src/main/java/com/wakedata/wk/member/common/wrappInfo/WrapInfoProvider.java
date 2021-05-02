package com.wakedata.wk.member.common.wrappInfo;

import org.springframework.stereotype.Component;

/**
 *
 * @author: hhf
 * @date: 2021/2/5
 **/
@Component
public class WrapInfoProvider {

    public String getEpName(Long epId){
        return "ep" + epId;
    }

    public String getAppName(Long appId){
        return "app name" + appId;
    }

    public String getStoreName(Long storeId){
        return "store name" + storeId;
    }
}
