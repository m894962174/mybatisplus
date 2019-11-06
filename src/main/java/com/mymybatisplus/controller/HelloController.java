package com.mymybatisplus.controller;

import com.mymybatisplus.service.ClientCopyService;
import com.mymybatisplus.vo.ClientCopy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    ClientCopyService clientCopyService;

    @RequestMapping("hello")
    @ResponseBody
    public List<ClientCopy> list(){
        return clientCopyService.list();
    }
}
