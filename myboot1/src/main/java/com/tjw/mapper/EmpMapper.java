package com.tjw.mapper;

import com.tjw.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author jingwen.tang
 * Created ON 2017/9/21 上午 11:37.
 * @Position Beijing
 */
@Mapper
public interface EmpMapper {

    public User getUser(String id);
}
