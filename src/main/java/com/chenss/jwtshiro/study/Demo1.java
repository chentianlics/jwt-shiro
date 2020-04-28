package com.chenss.jwtshiro.study;

import com.sun.tools.corba.se.idl.SequenceGen;

import java.util.*;

/**
 * @ClassName Demo1
 * @Description TODO
 * @Auther chenss
 * @Date 2020/4/27 2:18 PM
 * @Version 1.0
 **/
public class Demo1 {
    private final List list = new ArrayList();

    public static void main(String[] args) {
//        Demo1 d = new Demo1();
//        d.list.add(new Object());
//        d.list.add(new Object());
//        System.out.println();
//        Thread.currentThread().getName();
        String s = "hello";
        LinkedList<String> list = new LinkedList();
        byte[] bytes = s.getBytes();
        for (byte ch : bytes) {
            list.addFirst((char)ch+"");
            //list.addLast((char) ch + "");
            //list.addFirst((char)ch+"");
        }
        list.forEach(System.out::print);
        System.out.println("===========");
        while (list.size() > 0) {
            String pop = list.pop();
            System.out.print(pop);
        }
//        Object obj = new Object();
//        int i = obj.hashCode();
//        List list = new ArrayList();
//        list.add(obj);
//        list.add(obj);
//        list.add(obj);
//        Set set = new HashSet();
//        for (Object o:list){
//            set.add(o);
//        }
//
//        System.out.println();


    }
}
