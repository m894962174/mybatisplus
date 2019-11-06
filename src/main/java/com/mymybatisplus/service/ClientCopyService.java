package com.mymybatisplus.service;

import com.mymybatisplus.mapper.ClientCopyMapper;
import com.mymybatisplus.vo.ClientCopy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientCopyService {

    @Autowired
    private ClientCopyMapper clientCopyMapper;

    public List<ClientCopy> list(){
        return clientCopyMapper.selectList(null);
    }
}
