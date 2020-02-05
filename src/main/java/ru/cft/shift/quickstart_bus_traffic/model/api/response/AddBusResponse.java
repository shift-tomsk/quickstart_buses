package ru.cft.shift.quickstart_bus_traffic.model.api.response;

public class AddBusResponse {
    private String number;
    private String modelName;
    private String producer;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "AddBusResponse{" +
                "number='" + number + '\'' +
                ", modelName='" + modelName + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
