package ru.cft.shift.quickstart_bus_traffic.model.api.request;

public class AddBusRequest {
    private String name;
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "AddBusRequest{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
