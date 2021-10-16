package pjatk.komputer;

import java.util.List;

public class Computer {

    private String name;
    private Integer id;
    private double commission;
    private List<Component> componentList;

    public Computer(String name, Integer id, double commission, List<Component> componentList) {
        this.name = name;
        this.id = id;
        this.commission = commission;
        this.componentList = componentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public List<Component> getComponentList() {
        return componentList;
    }

    public void setComponentList(List<Component> componentList) {
        this.componentList = componentList;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", commission=" + commission +
                ", componentList=" + componentList +
                '}';
    }
}
