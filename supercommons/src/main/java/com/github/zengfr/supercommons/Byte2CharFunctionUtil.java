package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.bytes.Byte2CharFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Byte2CharFunctionUtil{ 
public static it.unimi.dsi.fastutil.bytes.Byte2CharFunction singleton(java.lang.Byte p0,java.lang.Character p1){
return Byte2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharFunction singleton(byte p0,char p1){
return Byte2CharFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharFunction unmodifiable(it.unimi.dsi.fastutil.bytes.Byte2CharFunction p0){
return Byte2CharFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharFunction primitive(java.util.function.Function<? super java.lang.Byte, ? extends java.lang.Character> p0){
return Byte2CharFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharFunction p0,java.lang.Object p1){
return Byte2CharFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.bytes.Byte2CharFunction synchronize(it.unimi.dsi.fastutil.bytes.Byte2CharFunction p0){
return Byte2CharFunctions.synchronize(p0);
}
}