package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.chars.Char2ByteFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Char2ByteFunctionUtil{ 
public static it.unimi.dsi.fastutil.chars.Char2ByteFunction singleton(java.lang.Character p0,java.lang.Byte p1){
return Char2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteFunction singleton(char p0,byte p1){
return Char2ByteFunctions.singleton(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteFunction unmodifiable(it.unimi.dsi.fastutil.chars.Char2ByteFunction p0){
return Char2ByteFunctions.unmodifiable(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteFunction primitive(java.util.function.Function<? super java.lang.Character, ? extends java.lang.Byte> p0){
return Char2ByteFunctions.primitive(p0);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteFunction synchronize(it.unimi.dsi.fastutil.chars.Char2ByteFunction p0,java.lang.Object p1){
return Char2ByteFunctions.synchronize(p0,p1);
}
public static it.unimi.dsi.fastutil.chars.Char2ByteFunction synchronize(it.unimi.dsi.fastutil.chars.Char2ByteFunction p0){
return Char2ByteFunctions.synchronize(p0);
}
}