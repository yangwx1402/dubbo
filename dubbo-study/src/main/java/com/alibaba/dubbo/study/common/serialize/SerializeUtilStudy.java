package com.alibaba.dubbo.study.common.serialize;

import com.alibaba.dubbo.common.beanutil.JavaBeanDescriptor;
import com.alibaba.dubbo.common.beanutil.JavaBeanSerializeUtil;

/**
 * Created by dell on 2016/3/8.
 */
public class SerializeUtilStudy {

    public static void serializeJavaBean(){
        StudyUser user = new StudyUser();
        user.setAge(30);
        user.setGender("男");
        user.setName("测试");

        JavaBeanDescriptor desc = JavaBeanSerializeUtil.serialize(user);
        System.out.println(desc);
        System.out.println(desc.getType());
    }

    public static void main(String[] args) {
        SerializeUtilStudy.serializeJavaBean();
    }
}
