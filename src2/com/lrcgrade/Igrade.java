package com.lrcgrade;

import java.sql.ResultSet;
import java.util.List;

public interface Igrade {
    int add(grade ga);
    
    int update(grade ga);
    
    int delete(int gradeid);
    
    List getAll();
}
