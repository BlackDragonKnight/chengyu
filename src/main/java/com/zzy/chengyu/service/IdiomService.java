package com.zzy.chengyu.service;

import com.zzy.chengyu.pojo.DO.IdiomDO;
import com.zzy.chengyu.pojo.Result;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public interface IdiomService {

    IdiomDO getIdiom(String idiom);

}
