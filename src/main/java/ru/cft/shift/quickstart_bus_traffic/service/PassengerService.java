package ru.cft.shift.quickstart_bus_traffic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.quickstart_bus_traffic.entity.PassengerEntity;
import ru.cft.shift.quickstart_bus_traffic.repository.IPassengerRepository;

@Service
public class PassengerService implements IPassengerService {

  @Autowired
  private IPassengerRepository passengerRepository;

  @Override
  public void add(PassengerEntity bus) {
    passengerRepository.save(bus);
  }

  @Override
  public PassengerEntity add(String name, boolean isGatecrasher) {
    PassengerEntity passengerEntity = new PassengerEntity();
    passengerEntity.setName(name);
    passengerEntity.setGatecrasher(isGatecrasher);
    return passengerRepository.save(passengerEntity);
  }

  @Override
  public PassengerEntity get(Long id) {
    return passengerRepository.findById(id).orElse(null);
  }

  @Override
  public PassengerEntity getByName(String name) {
    return passengerRepository.getPassengerEntityByName(name);
  }
}
