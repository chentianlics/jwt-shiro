package com.chenss.jwtshiro.study;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * @ClassName Subject
 * @Description TODO
 * @Auther chenss
 * @Date 2020/4/26 11:09 PM
 * @Version 1.0
 **/
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int status;

    private int getStatus(){
        return status;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }
}
