package com.lrc20180929_2;

import java.sql.ResultSet;
import java.util.List;

/**
 * Ϊ����grade ʵ����涨����
 * @author Administrator
 *
 */
public interface Igrade {
    int add(grade ga);
    
    int update(grade ga);
    
    int delete(int gradeid);
    
    List getAll();
}
