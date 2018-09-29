import java.util.List;

public interface Igrade {
    int add(grade gr);
    
    int update(grade gr);
    
    int delete(int gradeid);
    
    List getAll(); 
}
