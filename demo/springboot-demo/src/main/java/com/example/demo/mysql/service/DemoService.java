package com.example.demo.mysql.service;

import com.example.demo.mysql.entity.DemoTable;

public interface DemoService {

    public DemoTable getDemoTableById(int id);

    public DemoTable getDemoTableByKey(String key);

    public int insertDemoTable(DemoTable demoTable);

    public int deleteDemoTableById(int id);
}
