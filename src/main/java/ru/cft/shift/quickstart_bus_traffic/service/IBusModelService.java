package ru.cft.shift.quickstart_bus_traffic.service;

import ru.cft.shift.quickstart_bus_traffic.entity.BusModelEntity;

public interface IBusModelService {
  void add(BusModelEntity bus);
  BusModelEntity add(String name, Long size, String producer);
  BusModelEntity get(Long id);
  BusModelEntity getByName(String name);
}
