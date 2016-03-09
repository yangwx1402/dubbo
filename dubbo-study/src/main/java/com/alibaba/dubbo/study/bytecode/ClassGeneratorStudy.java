package com.alibaba.dubbo.study.bytecode;

import com.alibaba.dubbo.common.bytecode.ClassGenerator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/3/9.
 */
public class ClassGeneratorStudy {

    public static void test() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ClassGenerator generator = ClassGenerator.newInstance();
        generator.setClassName("com.alibaba.dubbo.study.bytecode.Test2");
        generator.addField("name",1,String.class);
        generator.addMethod("public void setName(String name){this.name=name;}");
        generator.addMethod("public String getName(){return this.name;}");
        Class clazz = generator.toClass();
        Object obj = clazz.newInstance();
        Method m = clazz.getMethod("setName",String.class);
        m.invoke(obj,"yangyong");
        Method getMethod = clazz.getMethod("getName");
        System.out.println(generator);
        System.out.println(getMethod.invoke(obj));
    }
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        ClassGeneratorStudy.test();
    }
}
