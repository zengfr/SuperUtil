package com.github.zengfr.supercommons;
import it.unimi.dsi.fastutil.floats.Float2FloatSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Float2FloatSortedMapUtil{ 
public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap singleton(float p0,float p1){
return Float2FloatSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap singleton(java.lang.Float p0,java.lang.Float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap singleton(java.lang.Float p0,java.lang.Float p1){
return Float2FloatSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap singleton(float p0,float p1,it.unimi.dsi.fastutil.floats.FloatComparator p2){
return Float2FloatSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap unmodifiable(it.unimi.dsi.fastutil.floats.Float2FloatSortedMap p0){
return Float2FloatSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2FloatSortedMap p0,java.lang.Object p1){
return Float2FloatSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.floats.Float2FloatSortedMap synchronize(it.unimi.dsi.fastutil.floats.Float2FloatSortedMap p0){
return Float2FloatSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.floats.Float2FloatMap.Entry> fastIterator(it.unimi.dsi.fastutil.floats.Float2FloatSortedMap p0){
return Float2FloatSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.floats.Float2FloatMap.Entry> fastIterable(it.unimi.dsi.fastutil.floats.Float2FloatSortedMap p0){
return Float2FloatSortedMaps.fastIterable(p0);
}
}
