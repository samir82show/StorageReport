package controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "controller")
@SessionScoped
public class Controller implements Serializable {

    private float total, val2014_2, val2014_3;

    @PostConstruct
    public void init() {
        total = 242210.9f;
        val2014_2 = 400;
        val2014_3 = 750;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getVal2014_2() {
        return val2014_2;
    }

    public void setVal2014_2(float val2014_2) {
        this.val2014_2 = val2014_2;
    }

    public float getVal2014_3() {
        return val2014_3;
    }

    public void setVal2014_3(float val2014_3) {
        this.val2014_3 = val2014_3;
    }

    
}
