package com.zzy.chengyu.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zzy.chengyu.mapper.IdiomMapper;
import com.zzy.chengyu.pojo.DO.IdiomDO;
import com.zzy.chengyu.service.IdiomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

@Service
@Slf4j
public class IdiomServiceImpl implements IdiomService {

    @Resource
    private IdiomMapper idiomMapper;

    @Override
    public IdiomDO getIdiom(String idiom) {
        //去除末尾=号
        String idiomNe = idiom.substring(0,idiom.length()-1);
        String idiomNew = null;
        try {
            idiomNew = URLDecoder.decode(idiomNe,"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        log.info("接收前端参数；{}", idiomNew);
        String idiomName = idiomMapper.getIdiomName(idiomNew);
        log.info("数据库返回参数；{}", idiomName);
        IdiomDO idiomDO = new IdiomDO();
        if(idiomNew != null && idiomNew.equals(idiomName)){
            idiomDO.setName(idiomName);
        }
        log.info("返回给前端参数"+JSONObject.toJSONString(idiomDO));
        return idiomDO;
    }
}
