package org.example.houseKeeping.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.houseKeeping.pojo.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
