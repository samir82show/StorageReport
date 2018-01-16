package entity;

public class Storage {

    private String name;
    private float total, free;

    public Storage() {
    }

    public Storage(String name, float total, float free) {
        this.name = name;
        this.total = total;
        this.free = free;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getFree() {
        return free;
    }

    public void setFree(float free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Storage{" + "name=" + name + ", total=" + total + ", free=" + free + '}';
    }

    
    
}
