package com.itheima.service;

import com.itheima.pojo.Dept;

import java.util.List;

/**
 * 部门管理
 */
public interface DeptService {
    /**
     * 查询所有部门数据
     * @return
     */
    List<Dept> list();

    void delete(Integer id);


    void add(Dept dept);
}
