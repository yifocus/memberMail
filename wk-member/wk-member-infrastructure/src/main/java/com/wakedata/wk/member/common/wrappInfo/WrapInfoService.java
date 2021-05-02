package com.wakedata.wk.member.common.wrappInfo;

import cn.hutool.core.util.ReflectUtil;
import com.wakedata.common.dto.PageResultDTO;
import com.wakedata.common.dto.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

/**
 * @author: hhf
 * @date: 2021/2/5
 **/
@Component
public class WrapInfoService {

    private final static String FIELD_NAME_EP_ID = "epId";
    private final static String FIELD_NAME_EP_NAME = "epName";
    private final static String FIELD_NAME_APP_ID = "appId";
    private final static String FIELD_NAME_APP_NAME = "appName";
    private final static String FIELD_NAME_STORE_ID = "storeId";
    private final static String FIELD_NAME_STORE_NAME = "storeName";

    @Autowired
    WrapInfoProvider nameCache;

    public <T> List<T> wrapInfo(List<T> data) {
        if (data == null || data.size() == 0) {
            return data;
        }
        data.forEach(x -> {
            wrapInfo(x);
        });
        return data;
    }

    public  <T> T wrapInfo(T t) {
        if (Objects.isNull(t)) {
            return t;
        }

        if (t instanceof PageResultDTO) {
            Object obj = ((PageResultDTO) t).getData();
            if (Objects.isNull(obj)) {
                return t;
            }
            if (obj instanceof List) {
                wrapInfo((List)obj);
            }
            return t;
        }

        if (t instanceof ResultDTO) {
            Object obj = ((ResultDTO) t).getData();
            if (Objects.isNull(obj)) {
                return t;
            }
            wrapEpName(obj);
            wrapAppName(obj);
            wrapStoreName(obj);
            return t;
        }

        wrapEpName(t);
        wrapAppName(t);
        wrapStoreName(t);
        return t;
    }

    private <T> T wrapStoreName(T t) {
        if (!ReflectUtil.hasField(t.getClass(), FIELD_NAME_STORE_ID) ||
                !ReflectUtil.hasField(t.getClass(), FIELD_NAME_STORE_NAME)) {
            return t;
        }
        Long storeId = (Long) ReflectUtil.getFieldValue(t, FIELD_NAME_STORE_ID);
        if (Objects.isNull(storeId)) {
            return t;
        }
        ReflectUtil.setFieldValue(t, FIELD_NAME_STORE_NAME, nameCache.getStoreName(storeId));
        return t;
    }

    private <T> T wrapEpName(T t) {
        if (!ReflectUtil.hasField(t.getClass(), FIELD_NAME_EP_ID) ||
                !ReflectUtil.hasField(t.getClass(), FIELD_NAME_EP_NAME)) {
            return t;
        }
        Long epId = (Long) ReflectUtil.getFieldValue(t, FIELD_NAME_EP_ID);
        if (Objects.isNull(epId)) {
            return t;
        }
        ReflectUtil.setFieldValue(t, FIELD_NAME_EP_NAME, nameCache.getEpName(epId));
        return t;
    }

    private <T> T wrapAppName(T t) {
        if (!ReflectUtil.hasField(t.getClass(), FIELD_NAME_APP_ID) ||
                !ReflectUtil.hasField(t.getClass(), FIELD_NAME_APP_NAME)) {
            return t;
        }
        Long appId = (Long) ReflectUtil.getFieldValue(t, FIELD_NAME_APP_ID);
        if (Objects.isNull(appId)) {
            return t;
        }
        ReflectUtil.setFieldValue(t, FIELD_NAME_APP_NAME, nameCache.getAppName(appId));
        return t;
    }

}
