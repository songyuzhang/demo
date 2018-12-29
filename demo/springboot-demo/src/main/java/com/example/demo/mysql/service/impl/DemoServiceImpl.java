package com.example.demo.mysql.service.impl;

import com.example.demo.mysql.dao.DemoTableDao;
import com.example.demo.mysql.entity.DemoTable;
import com.example.demo.mysql.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "demoService")
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoTableDao demoTableDao;

    @Override
    public DemoTable getDemoTableById(int id) {
        return demoTableDao.getDemoTableById(id);
    }

    @Override
    public DemoTable getDemoTableByKey(String key) {
        return demoTableDao.getDemoTableByKey(key);
    }

    @Override
    public int insertDemoTable(DemoTable demoTable) {
        return demoTableDao.insertDemoTable(demoTable);
    }

    @Override
    public int deleteDemoTableById(int id) {
        return demoTableDao.deleteDemoTableById(id);
    }
}
