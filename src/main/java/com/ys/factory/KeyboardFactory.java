package com.ys.factory;

public class KeyboardFactory {

    public static Keyboard getInstance(int brand) {
        if(1 == brand){
            return new HPKeyboard();
        }
        /*else if(2 == brand){
            return new LenovoKeyboard();
        } else if(3 == brand){
            return new DellKeyboard();
        }*/
        return null;
    }


    public static void main(String[] args) {
        KeyboardFactory keyboardFactory = new KeyboardFactory();
        Keyboard lenovoKeyboard = KeyboardFactory.getInstance(1);
        //...
        lenovoKeyboard.print();
    }

}
