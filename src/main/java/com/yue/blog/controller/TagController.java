package com.yue.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jxd on 2018/6/9.
 */
@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(method = RequestMethod.GET)
    public List getDbType(){
        String sql = "select * from tag";
        List list =  jdbcTemplate.queryForList(sql);

        return list;
    }
    @RequestMapping(method = RequestMethod.POST)
    public List getDbType123(){
        String sql = "select * from tag";
        List list =  jdbcTemplate.queryForList(sql);

        return list;
    }
}
