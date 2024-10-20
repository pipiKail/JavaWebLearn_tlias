package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName: PageBean
 * @Description:
 * @Author: Kai
 * @Date: 2024/10/12 16:54
 * @Version: 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean {

    private Long total;
    private List rows;
}
