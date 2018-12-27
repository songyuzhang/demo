package com.example.demo.vo;

import java.io.Serializable;

/**
 * @author songyuzhang
 */
public class DemoVO implements Serializable {
    private static final long serialVersionUID = -482548105563707530L;

    private Integer id;
    private String key;
    private String value;

    public DemoVO() {
    }

    public DemoVO(Integer id, String key, String value) {
        this.id = id;
        this.key = key;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DemoVO{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
