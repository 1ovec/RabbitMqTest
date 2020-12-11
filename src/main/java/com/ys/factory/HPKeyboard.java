package com.ys.factory;

import javax.naming.Context;

public class HPKeyboard implements Keyboard{
    @Override
    public void print() {
        System.out.println("HPKeyboard---print");
    }

    @Override
    public void input(Context context) {

    }
}
