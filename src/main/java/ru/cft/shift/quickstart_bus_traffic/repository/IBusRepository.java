package ru.cft.shift.quickstart_bus_traffic.repository;

import org.springframework.data.repository.CrudRepository;
import ru.cft.shift.quickstart_bus_traffic.entity.BusEntity;

public interface IBusRepository extends CrudRepository<BusEntity, Long> {
  BusEntity getBusEntityByNumber(String number);
}
