package ru.cft.shift.quickstart_bus_traffic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.cft.shift.quickstart_bus_traffic.entity.BusModelEntity;
import ru.cft.shift.quickstart_bus_traffic.repository.IBusModelRepository;

@Service
public class BusModelService implements IBusModelService {

  @Autowired
  private IBusModelRepository busModelRepository;

  @Override
  public void add(BusModelEntity bus) {
    busModelRepository.save(bus);
  }

  @Override
  public BusModelEntity add(String name, Long size, String producer) {
    BusModelEntity busModelEntity = new BusModelEntity();
    busModelEntity.setName(name);
    busModelEntity.setSize(size);
    busModelEntity.setProducer(producer);
    return busModelRepository.save(busModelEntity);
  }

  @Override
  public BusModelEntity get(Long id) {
    return busModelRepository.findById(id).orElse(null);
  }

  @Override
  public BusModelEntity getByName(String name) {
    return busModelRepository.getBusModelEntityByName(name);
  }
}
