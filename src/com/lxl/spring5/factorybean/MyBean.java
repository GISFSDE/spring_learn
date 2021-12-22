package com.lxl.spring5.factorybean;

import com.lxl.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**FactoryBean*/
public class MyBean implements FactoryBean<Course> {

    /**定义返回bean类型*/
    @Override
    public Course getObject() throws Exception {
        Course course=new Course();
        course.setCname("体育课");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
