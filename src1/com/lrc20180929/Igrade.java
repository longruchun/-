package com.lrc20180929;

import java.util.List;

import com.lrc20180929_2.grade;

public interface Igrade {
     int add(Grade ga);//����
    
    int update(Grade ga);//����
    
    int delete(int gradeid);//ɾ��
    
    List getAll();
}
