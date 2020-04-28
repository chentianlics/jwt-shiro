package com.chenss.jwtshiro.study;

/**
 * @ClassName VolatileTest
 * @Description TODO
 * @Auther chenss
 * @Date 2020/4/26 9:32 PM
 * @Version 1.0
 **/
public class VolatileTest {
    private static volatile Integer a = 0;
    public static void main(String[] args) {

        Thread t = new Thread(){
            @Override
            public void run() {
                int i=1;
                while (i<=20){
                    synchronized (a){
                        i++;
                        a++;
                        System.out.println("t1:->"+a);
                        try {
                            sleep(500);
                        }catch (InterruptedException e){
                        }
                    }

                }
            }
        };
        t.start();
        Thread t2 = new Thread(){
            @Override
            public void run() {
                int i=1;
                while (i<=20){
                    synchronized (a){
                        i++;
                        a++;
                        System.out.println("t2:->"+a);
                        try {
                            sleep(500);
                        }catch (InterruptedException e){
                        }
                    }
                }
            }
        };
        t2.start();
    }
}
