package com.yyhn.servletConig;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestListener implements ServletRequestListener{
    public void requestDestroyed (ServletRequestEvent sre) {
        System.out.println("requestDestroyed");
    }
    public void requestInitialized (ServletRequestEvent sre) {
        System.out.println("requestInitialized");
    }
}
