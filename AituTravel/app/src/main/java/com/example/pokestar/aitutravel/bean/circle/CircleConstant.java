package com.example.pokestar.aitutravel.bean.circle;

public class CircleConstant {
    public static final String ARGUMENT_CLASS_ID = "argument_class_id";

    public static final CircleBean[] getCircleClass(){
        CircleBean[] classes = new CircleBean[2];
        classes[0] = new CircleBean(0,"消息");
        classes[1] = new CircleBean(1,"通讯录");
        return classes;
    }
}
