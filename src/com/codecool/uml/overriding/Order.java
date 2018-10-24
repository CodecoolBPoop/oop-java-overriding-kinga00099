package com.codecool.uml.overriding;

public class Order implements Orderable {
    private int id;
    private String status;
    private static int id_counter = 0;

    public String getStatus(){
        return null;
    }

    public boolean checkout(){
        return true;
    }

    public boolean pay(){
        return true;
    }


}
