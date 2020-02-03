package ru.cft.shift.quickstart_bus_traffic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.cft.shift.quickstart_bus_traffic.entity.PassengerEntity;
import ru.cft.shift.quickstart_bus_traffic.service.IPassengerService;

@RestController
public class PassengerController {
  @Autowired
  private IPassengerService passengerService;

  @RequestMapping(
      method = RequestMethod.POST,
      path = "/passenger/add",
      consumes = "application/x-www-form-urlencoded",
      produces = "application/json"
  ) public PassengerEntity add(
      @RequestParam(name = "name") String name,
      @RequestParam(name = "isgatecrasher") boolean isgatecrasher) {
    return passengerService.add(name, isgatecrasher);
  }

  @RequestMapping(method = RequestMethod.GET, path = "/passenger", produces = "application/json")
  public PassengerEntity get(@RequestParam(name = "name") String name) {
    return passengerService.getByName(name);
  }
}
