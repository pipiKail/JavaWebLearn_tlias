package com.itheima.controller;

import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 部门管理Controller
 */
@Slf4j
@RestController
@RequestMapping("/depts")

public class DeptController {

    //private static Logger log = LoggerFactory.getLogger(DeptController.class);

    @Autowired
    private DeptService deptService;



    //@RequestMapping(value = "/depts", method = RequestMethod.GET)
    @GetMapping
    public Result list() {

        log.info("查询全部部门列表");
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }


    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("根据id删除部门:{}", id);
        deptService.delete(id);
        return Result.success();
    }

    @PostMapping
    public Result add(@RequestBody Dept dept) {
        log.info("新增部门:{}", dept);
        deptService.add(dept);
        return Result.success();
    }


}





