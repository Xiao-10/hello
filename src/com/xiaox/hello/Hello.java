package com.xiaox.hello;

/**
 * Created by TinkPad on 2020/2/13.
 */
public class Hello {

    public static void main(String[] args) {
        for(int i = 100;i < 1000;i++){
            int j1 = i / 100;
            int j2 = (i - j1*100)/10;
            int j3 = i % 10;

            if(i == j1*j1*j1 + j2*j2*j2 + j3*j3*j3){
                System.out.println(i);
            }
        }
    }

}
