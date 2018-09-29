import java.util.List;

public class gradeDao_jdbcImpl implements Igrade {
    
	
	
	@Override
	public int add(grade gr) {
		
		String sql="insert into grade(gradeName) values(?)";
		Object[] params= {gr.getGradeName()};
		List list=jdbcHelper.executeSql(sql, params,false);
		return (int)list.get(0);
	}

	@Override
	public int update(grade gr) {
		String sql="update grade set gradeName=? where gradeid=?";
		Object[] params= {gr.getGradeName(),gr.getGradeid()};
		List list=jdbcHelper.executeSql(sql, params,false);
		return (int)list.get(0);
	}

	@Override
	public int delete(int gradeid) {
		String sql="delete from grade where gradeid=?";
		Object[] params= {gradeid};
		List list=jdbcHelper.executeSql(sql, params,false);
		return (int)list.get(0);
	}

	@Override
	public List getAll() {
		String sql="select * from grade";
		
		List list=jdbcHelper.executeSql(sql, null,true);
		return (List)list.get(1);
	}

}
