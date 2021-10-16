package pjatk.komputer;

import java.util.ArrayList;
import java.util.List;

public class Component {
    private Integer id;
    private String brand;
    private String model;

    public Component(Integer id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public Component(Integer id, String brand, String model, List<Component> lista) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public Integer getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
}


