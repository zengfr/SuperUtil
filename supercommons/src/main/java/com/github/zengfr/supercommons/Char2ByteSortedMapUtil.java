package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2ByteSortedMaps;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2ByteSortedMapUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap singleton(char p0,byte p1){
return Char2ByteSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap singleton(java.lang.Character p0,java.lang.Byte p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap singleton(java.lang.Character p0,java.lang.Byte p1){
return Char2ByteSortedMaps.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap singleton(char p0,byte p1,it.unimi.dsi.fastutil.chars.CharComparator p2){
return Char2ByteSortedMaps.singleton(p0,p1,p2);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap unmodifiable(it.unimi.dsi.fastutil.chars.Char2ByteSortedMap p0){
return Char2ByteSortedMaps.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2ByteSortedMap p0,java.lang.Object p1){
return Char2ByteSortedMaps.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteSortedMap synchronize(it.unimi.dsi.fastutil.chars.Char2ByteSortedMap p0){
return Char2ByteSortedMaps.synchronize(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator<it.unimi.dsi.fastutil.chars.Char2ByteMap.Entry> fastIterator(it.unimi.dsi.fastutil.chars.Char2ByteSortedMap p0){
return Char2ByteSortedMaps.fastIterator(p0);
}
public static it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterable<it.unimi.dsi.fastutil.chars.Char2ByteMap.Entry> fastIterable(it.unimi.dsi.fastutil.chars.Char2ByteSortedMap p0){
return Char2ByteSortedMaps.fastIterable(p0);
}
}