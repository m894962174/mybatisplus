package com.mymybatisplus.mapper;


//当mapper接口继承BaseMapper时，就会有了mybatis-plus最有用，最强大的Mapper CRUD 接口，大部分增删改查都可以利用此接口里方法完成

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mymybatisplus.vo.ClientCopy;


public interface ClientCopyMapper  extends BaseMapper<ClientCopy> {

}
