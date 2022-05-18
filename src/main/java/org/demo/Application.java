package org.demo;

import org.demo.model.SingleObject;

public class Application {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        //show message
        singleObject.showMessage();
    }
}
