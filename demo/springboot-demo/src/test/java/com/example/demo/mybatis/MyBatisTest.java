package com.example.demo.mybatis;

import com.example.demo.mysql.dao.DemoTableDao;
import com.example.demo.mysql.entity.DemoTable;
import com.example.demo.mysql.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void testGetDemoTable() {
        DemoTable demoTable = demoService.getDemoTableById(10);
        System.out.println(demoTable.getKey() + ": " + demoTable.getValue());
    }

    @Test
    public void testInsertDemoTable() {

        demoService.deleteDemoTableById(1);
        demoService.deleteDemoTableById(2);

        for (int i = 11; i < 20; i++) {
            DemoTable demoTable = new DemoTable();
            demoTable.setKey("key" + i);
            demoTable.setValue("value" + i);
            demoService.insertDemoTable(demoTable);
        }

    }

}
