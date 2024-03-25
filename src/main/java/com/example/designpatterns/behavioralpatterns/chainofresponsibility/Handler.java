package com.example.designpatterns.behavioralpatterns.chainofresponsibility;

public abstract class Handler {
    private Handler next;

    

    public void setNext(Handler next) {
        this.next = next;
    }



    public static Handler link(Handler first, Handler...handlers){
        Handler head = first;
        for (Handler handler : handlers) {
            head.setNext(handler);
            head = handler;
        }
        return first;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password){
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
