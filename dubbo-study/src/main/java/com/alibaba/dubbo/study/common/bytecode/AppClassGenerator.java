package com.alibaba.dubbo.study.common.bytecode;

import com.alibaba.dubbo.common.bytecode.ClassGenerator;

/**
 * Created by dell on 2016/3/10.
 */
public class AppClassGenerator {
    public static Class<AppInterface> getAppProxyClass(){
        ClassGenerator generator = ClassGenerator.newInstance();
        generator.setClassName("com.alibaba.dubbo.study.common.bytecode.AppInterfaceImpl");
        generator.addDefaultConstructor();
        generator.addInterface(AppInterface.class);
        generator.addMethod("public String execute(String name){return \"my name is \"+name;}");
        return (Class<AppInterface>) generator.toClass();
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class<AppInterface> clazz = AppClassGenerator.getAppProxyClass();
        System.out.println(clazz.getName());
        AppInterface app = clazz.newInstance();
        System.out.println(app.execute("yangyong"));
    }
}
