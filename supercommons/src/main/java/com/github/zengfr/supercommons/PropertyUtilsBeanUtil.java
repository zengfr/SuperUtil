package com.github.zengfr.supercommons;
import org.apache.commons.beanutils.WrapDynaClass;
/**
* @author zengfr
* https://github.com/zengfr/Super-Commons
* http://blog.csdn.net/zfrong/
* zengfr3000@qq.com
*/
public final class PropertyUtilsBeanUtil{ 
public static org.apache.commons.beanutils.WrapDynaClass createDynaClass(java.lang.Class<?> p0,org.apache.commons.beanutils.PropertyUtilsBean p1){
return WrapDynaClass.createDynaClass(p0,p1);
}
}
