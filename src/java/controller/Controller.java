package controller;

import entity.Storage;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "controller")
@SessionScoped
public class Controller implements Serializable {

    private Storage storage;

    @PostConstruct
    public void init() {
        storage = new Storage();
    }

    public Storage getVmax() {
        storage.setName("VMAX-3");
        storage.setTotal(245455);
        storage.setFree(144555);
        return storage;
    }

    public Storage getIsilon() {
        storage.setName("Isilon");
        storage.setTotal(245455);
        storage.setFree(144555);
        return storage;
    }

    public Storage getUnity() {
        storage.setName("Unity");
        storage.setTotal(245455);
        storage.setFree(144555);
        return storage;
    }

    public Storage getXtremeIO() {
        storage.setName("XtremeIO");
        storage.setTotal(245455);
        storage.setFree(144555);
        return storage;
    }

}
