package ru.cft.shift.quickstart_bus_traffic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.cft.shift.quickstart_bus_traffic.entity.BusModelEntity;
import ru.cft.shift.quickstart_bus_traffic.service.IBusModelService;

@RestController
public class BusModelController {
  @Autowired
  private IBusModelService busModelService;

  @RequestMapping(
      method = RequestMethod.POST,
      path = "/bus/model/add",
      consumes = "application/x-www-form-urlencoded",
      produces = "application/json"
  ) public BusModelEntity add(
      @RequestParam(name = "name") String name,
      @RequestParam(name = "size") Long size,
      @RequestParam(name = "producer") String producer) {
    return busModelService.add(name, size, producer);
  }

  @RequestMapping(method = RequestMethod.GET, path = "/bus/model", produces = "application/json")
  public BusModelEntity get(@RequestParam(name = "name") String name) {
    return busModelService.getByName(name);
  }
}
