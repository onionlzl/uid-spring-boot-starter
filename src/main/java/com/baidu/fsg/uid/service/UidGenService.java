package com.baidu.fsg.uid.service;

import com.baidu.fsg.uid.UidGenerator;

import javax.annotation.Resource;

/**
 * @Content:
 * @Author lizhenlong
 * @Date 2022/12/21 16:08
 */
@Resource
public class UidGenService {

    @Resource
    private UidGenerator uidGenerator;

    public long getUid(){
        return uidGenerator.getUID();
    }
}
