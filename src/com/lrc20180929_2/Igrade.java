package com.lrc20180929_2;

import java.sql.ResultSet;
import java.util.List;

public interface Igrade {
    int add(grade ga);
    
    int update(grade ga);
    
    int delete(int gradeid);
    
    List getAll();
}
