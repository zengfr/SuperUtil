package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.booleans.BooleanIterators;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class BooleanIteratorArrayUtil{ 
public static it.unimi.dsi.fastutil.booleans.BooleanIterator concat(it.unimi.dsi.fastutil.booleans.BooleanIterator[] p0,int p1,int p2){
return BooleanIterators.concat(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.booleans.BooleanIterator concat(it.unimi.dsi.fastutil.booleans.BooleanIterator[] p0){
return BooleanIterators.concat(p0);
}
}