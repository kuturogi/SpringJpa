package com.bertugkuturoglu.controller.impl;


import com.bertugkuturoglu.configuration.DataSource;
import com.bertugkuturoglu.configuration.GlobalProperties;
import com.bertugkuturoglu.configuration.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/api/property")
public class PropertySourceController {

           @Autowired
        private GlobalProperties globalProperties;


    @GetMapping("/datasource")
    public DataSource getDataSource(){



//        DataSource dataSource = new DataSource();
//        dataSource.setUrl(globalProperties.getUrl());
//        dataSource.setUsername(globalProperties.getUsername());
//        dataSource.setPassword(globalProperties.getPassword());
//
//        return dataSource;
        return null;
    }

    @GetMapping("/getServers")
    public List<Server> getServers(){
        return globalProperties.getServers();
    }
}
