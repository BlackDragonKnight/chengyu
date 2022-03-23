package com.zzy.chengyu.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author 11723
 */
@Mapper
public interface IdiomMapper {

    String getIdiomName(String name);


}
