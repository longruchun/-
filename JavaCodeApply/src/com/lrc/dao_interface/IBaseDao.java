package com.lrc.dao_interface;

import java.util.List;

public interface IBaseDao<T> {
   int add(T t);
   int Update(T t);
   int delete(int id);
   
   List<T> getAll();
}
