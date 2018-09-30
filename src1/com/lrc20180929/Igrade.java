package com.lrc20180929;

import java.util.List;

import com.lrc20180929_2.grade;

public interface Igrade {
     int add(Grade ga);//增加
    
    int update(Grade ga);//更新
    
    int delete(int gradeid);//删除
    
    List getAll();
}
