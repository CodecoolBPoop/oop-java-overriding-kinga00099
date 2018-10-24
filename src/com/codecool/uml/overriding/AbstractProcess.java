package com.codecool.uml.overriding;

public abstract class AbstractProcess {

    abstract protected void action(Orderable item);

    public void process(Orderable item){
        this.stepBefore();
        this.action(item);
        this.stepAfter();
    }

    public void stepBefore(){
        System.out.println("Step before");
    }

    public void stepAfter(){
        System.out.println("Step after");
    }

}
