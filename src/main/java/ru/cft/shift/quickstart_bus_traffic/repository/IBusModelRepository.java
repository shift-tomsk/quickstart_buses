package ru.cft.shift.quickstart_bus_traffic.repository;

import org.springframework.data.repository.CrudRepository;
import ru.cft.shift.quickstart_bus_traffic.entity.BusModelEntity;

public interface IBusModelRepository extends CrudRepository<BusModelEntity, Long> {
  BusModelEntity getBusModelEntityByName(String name);
}
