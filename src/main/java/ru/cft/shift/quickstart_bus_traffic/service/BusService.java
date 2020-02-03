package ru.cft.shift.quickstart_bus_traffic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.quickstart_bus_traffic.entity.BusEntity;
import ru.cft.shift.quickstart_bus_traffic.entity.BusModelEntity;
import ru.cft.shift.quickstart_bus_traffic.entity.PassengerEntity;
import ru.cft.shift.quickstart_bus_traffic.repository.IBusModelRepository;
import ru.cft.shift.quickstart_bus_traffic.repository.IBusRepository;
import ru.cft.shift.quickstart_bus_traffic.repository.IPassengerRepository;

@Service
public class BusService implements IBusService {

  @Autowired
  private IBusRepository busRepository;

  @Autowired
  private IBusModelRepository busModelRepository;

  @Autowired
  private IPassengerRepository passengerRepository;

  @Override
  public BusEntity add(BusEntity bus) {
    BusModelEntity busModelEntity = busModelRepository.getBusModelEntityByName("ПАЗ");
    bus.setModel(busModelEntity);
    return busRepository.save(bus);
  }

  @Override
  public BusEntity add(String name, String number) {
    BusModelEntity busModel = busModelRepository.getBusModelEntityByName(name);
    BusEntity busEntity = new BusEntity();
    busEntity.setNumber(number);
    busEntity.setModel(busModel);
    return busRepository.save(busEntity);
  }

  @Override
  public BusEntity addPassenger(String number, String passengerName) {
    BusEntity busEntity = busRepository.getBusEntityByNumber(number);
    PassengerEntity passengerEntity = passengerRepository.getPassengerEntityByName(passengerName);
    busEntity.getPassengers().add(passengerEntity);
    return busRepository.save(busEntity);
  }

  @Override
  public BusEntity get(Long id) {
    return busRepository.findById(id).orElse(null);
  }
}
