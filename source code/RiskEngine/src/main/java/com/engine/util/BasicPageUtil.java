package com.engine.util;

import com.engine.config.CommConst;
import com.engine.dao.IPage;
import com.engine.model.BaseApiResp;
import com.engine.model.RiskModel;
import com.github.pagehelper.PageInfo;

import java.util.List;

public class BasicPageUtil<T> {

    public BaseApiResp<PageInfo<T>> buildPage(List<T> list){
        BaseApiResp<PageInfo<T>> resp = new BaseApiResp<>();
        PageInfo<T> page =new PageInfo<>(list);
        resp.setData(page);
        resp.setCallResult(CommConst.EnumAPICallResult.Succ.getFlag());
        return  resp;

    }
}
