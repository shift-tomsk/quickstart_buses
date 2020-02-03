package ru.cft.shift.quickstart_bus_traffic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.cft.shift.quickstart_bus_traffic.entity.BusEntity;
import ru.cft.shift.quickstart_bus_traffic.service.IBusService;

@RestController
public class BusController {
  @Autowired
  private IBusService busService;

  @RequestMapping(
      method = RequestMethod.POST,
      path = "/bus/add",
      consumes = "application/x-www-form-urlencoded",
      produces = "application/json"
  ) public BusEntity add(
      @RequestParam(name = "number") String number,
      @RequestParam(name = "modelName") String modelName) {
    return busService.add(number, modelName);
  }

  @RequestMapping(
      method = RequestMethod.POST,
      path = "/bus/add/passenger",
      consumes = "application/x-www-form-urlencoded",
      produces = "application/json"
  ) public BusEntity addPassenger(
      @RequestParam(name = "number") String number,
      @RequestParam(name = "passengerName") String passengerName) {
    return busService.addPassenger(number, passengerName);
  }

  @RequestMapping(method = RequestMethod.GET, path = "/bus/{id}", produces = "application/json")
  public BusEntity get(@PathVariable(name = "id") Long id) {
    return busService.get(id);
  }
}
