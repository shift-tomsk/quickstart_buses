package ru.cft.shift.quickstart_bus_traffic.repository;

import org.springframework.data.repository.CrudRepository;
import ru.cft.shift.quickstart_bus_traffic.entity.PassengerEntity;

public interface IPassengerRepository extends CrudRepository<PassengerEntity, Long> {
  PassengerEntity getPassengerEntityByName(String name);
}
