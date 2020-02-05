package ru.cft.shift.quickstart_bus_traffic.service;

import ru.cft.shift.quickstart_bus_traffic.entity.BusEntity;
import ru.cft.shift.quickstart_bus_traffic.model.api.ResultResponse;
import ru.cft.shift.quickstart_bus_traffic.model.api.request.AddBusRequest;

public interface IBusService {
  BusEntity add(BusEntity bus);
  BusEntity add(String name, String number);
  ResultResponse createNewBus(AddBusRequest addBusRequest) throws Exception;
  BusEntity addPassenger(String number, String passengerName);
  BusEntity get(Long id);
}
