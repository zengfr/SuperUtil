package com.zengfr.supercommons;
import org.apache.commons.collections4.IteratorUtils;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class SkippingIteratorUtil{ 
public static <E> org.apache.commons.collections4.iterators.SkippingIterator<E> skippingIterator(java.util.Iterator<E> p0,long p1){
return IteratorUtils.skippingIterator(p0,p1);
}
}