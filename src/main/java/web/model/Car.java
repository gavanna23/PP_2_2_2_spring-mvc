package web.model;

public class Car {
    private int id;
    private String model;
    private int nomer;

    public Car(int id, String model, int nomer) {
        this.id = id;
        this.model = model;
        this.nomer = nomer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", nomer=" + nomer +
                '}';
    }
}
