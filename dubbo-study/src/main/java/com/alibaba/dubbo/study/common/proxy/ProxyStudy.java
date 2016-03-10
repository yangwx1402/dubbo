package com.alibaba.dubbo.study.common.proxy;


import com.alibaba.dubbo.common.bytecode.Proxy;
import com.alibaba.dubbo.study.common.bytecode.AppClassGenerator;
import com.alibaba.dubbo.study.common.bytecode.AppInterface;

/**
 * Created by dell on 2016/3/10.
 */
public class ProxyStudy {

    public static void main(String[] args) {
        Proxy proxy = Proxy.getProxy(AppInterface.class);
        System.out.println(proxy.getClass().getInterfaces().length);
        AppInterface app = (AppInterface) proxy.newInstance();
    }
}
