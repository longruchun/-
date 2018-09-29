package p20180929_dao_demo;

import java.sql.ResultSet;
import java.util.List;

/**
 * 为访问grade 实体灶规定方法
 * @author Administrator
 *
 */
public interface Igrade {
    int add(grade ga);
    
    int update(grade ga);
    
    int delete(int gradeid);
    
    List getAll();
}
