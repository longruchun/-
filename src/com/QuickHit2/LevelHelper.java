

package com.QuickHit2;



public class LevelHelper {
   /**
    * 用一个静态常量数组，存放控制级别特征的值数组
    * 之所以使用静态常的数组，一方面：这些控制数据在运行时不可改变
    * 二方面，使用static ,我们可以直接以类名调用该数组	
    */
   public static final Level[] levels= {
	  new Level(1,2,10,2,5),
	  new Level(2,3,10,3,6),
	  new Level(3,4,10,4,7),
	  new Level(4,5,10,5,8),
	  new Level(5,6,10,6,9),
	  new Level(6,7,10,7,10),
   };
}
