package com.zengfr.supercommons;
import it.unimi.dsi.fastutil.objects.Reference2FloatFunctions;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class Reference2FloatFunctionUtil{ 
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K> singleton(K p0,java.lang.Float p1){
return Reference2FloatFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K> singleton(K p0,float p1){
return Reference2FloatFunctions.singleton(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K> unmodifiable(it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K> p0){
return Reference2FloatFunctions.unmodifiable(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K> primitive(java.util.function.Function<? super K, ? extends java.lang.Float> p0){
return Reference2FloatFunctions.primitive(p0);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K> p0,java.lang.Object p1){
return Reference2FloatFunctions.synchronize(p0,p1);
}
public static <K> it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K> synchronize(it.unimi.dsi.fastutil.objects.Reference2FloatFunction<K> p0){
return Reference2FloatFunctions.synchronize(p0);
}
}