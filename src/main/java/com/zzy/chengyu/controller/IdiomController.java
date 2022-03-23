package com.zzy.chengyu.controller;

import com.zzy.chengyu.pojo.DO.IdiomDO;
import com.zzy.chengyu.pojo.Result;
import com.zzy.chengyu.service.IdiomService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class IdiomController {

    @Resource
    private IdiomService idiomService;

    @RequestMapping("/idiom")
    public IdiomDO idiom(@RequestBody String idiom){
        return idiomService.getIdiom(idiom);
    }
}
