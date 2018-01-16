package entity;

public class Storage {
    
    private String name;
    private float Total;
    private float Free;

    public Storage(String name, float Total, float Free) {
        this.name = name;
        this.Total = Total;
        this.Free = Free;
    }

    public Storage() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }

    public float getFree() {
        return Free;
    }

    public void setFree(float Free) {
        this.Free = Free;
    }

    @Override
    public String toString() {
        return "Storage{" + "name=" + name + ", Total=" + Total + ", Free=" + Free + '}';
    }
    
        
    
}
