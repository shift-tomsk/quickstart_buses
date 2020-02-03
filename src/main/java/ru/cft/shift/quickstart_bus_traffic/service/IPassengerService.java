package ru.cft.shift.quickstart_bus_traffic.service;

import ru.cft.shift.quickstart_bus_traffic.entity.PassengerEntity;

public interface IPassengerService {
  void add(PassengerEntity bus);
  PassengerEntity add(String name, boolean isGatecrasher);
  PassengerEntity get(Long id);
  PassengerEntity getByName(String name);
}
