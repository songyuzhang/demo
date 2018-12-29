package com.example.demo.mysql.dao;

import com.example.demo.mysql.entity.DemoTable;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Component
public interface DemoTableDao {

    DemoTable getDemoTableById(int id);

    DemoTable getDemoTableByKey(String key);

    int insertDemoTable(DemoTable demoTable);

    int deleteDemoTableById(int id);

}
