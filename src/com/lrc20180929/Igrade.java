package com.lrc20180929;

import java.util.List;

import p20180929_dao_demo.grade;

public interface Igrade {
     int add(Grade ga);//����
    
    int update(Grade ga);//����
    
    int delete(int gradeid);//ɾ��
    
    List getAll();
}
