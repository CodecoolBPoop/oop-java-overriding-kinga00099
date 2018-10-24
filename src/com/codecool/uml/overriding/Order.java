package com.codecool.uml.overriding;

public class Order implements Orderable {

    public static final String NEW = "new";
    public static final String CHECKED = "checked";
    public static final String PAYED = "payed";

    private int id;
    private String status;
    private static int id_counter = 0;

    public String getStatus(){
        return null;
    }

    @Override
    public boolean checkout(){
        if (status.equals(NEW)){
            status = CHECKED;
            return true;
        }
        return false;
    }

    @Override
    public boolean pay(){
        if (status.equals(CHECKED)){
            status = PAYED;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("id:%d, status:%s",
                this.id,
                this.status);
    }

    Order(){
        this.id = id_counter++;
        this.status = NEW;
    }


}
