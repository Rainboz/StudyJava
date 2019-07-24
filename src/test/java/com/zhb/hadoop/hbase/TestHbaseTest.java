package com.zhb.hadoop.hbase;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * @progrom StudyJava
 * @Description TODO
 * @Author rainboz
 * @Date 2019-07-24 下午7:08
 */
public class TestHbaseTest {
    TestHbase testHbase = new TestHbase();
    @Test
    public void tableExist() throws IOException {
        System.out.println(testHbase.tableExist("student"));
        System.out.println(testHbase.tableExist("stu"));
    }

    @Test
    public void createTable() throws IOException {
        testHbase.createTable("stu","info");
        System.out.println(testHbase.tableExist("stu"));
    }

    @Test
    public void deleteTable() {
    }
}