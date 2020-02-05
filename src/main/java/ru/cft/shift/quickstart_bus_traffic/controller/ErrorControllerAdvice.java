package ru.cft.shift.quickstart_bus_traffic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.cft.shift.quickstart_bus_traffic.model.api.ResponseCode;
import ru.cft.shift.quickstart_bus_traffic.model.api.ResponseStatus;
import ru.cft.shift.quickstart_bus_traffic.model.api.ResultResponse;

@ControllerAdvice
public class ErrorControllerAdvice {
    private final static Logger logger = LoggerFactory.getLogger(ErrorControllerAdvice.class);
    @ExceptionHandler
    public ResponseEntity<ResultResponse> handleException(Exception e) {
        logger.error(e.getMessage(), e);
        ResultResponse resultResponse = new ResultResponse();
        ResponseStatus responseStatus = new ResponseStatus();
        responseStatus.setCode(ResponseCode.ERROR.getCode());
        responseStatus.setErrorMessage("Сервис временно недоступен. Попробуйте позже.");
        resultResponse.setStatus(responseStatus);
        return ResponseEntity.status(HttpStatus.OK).body(resultResponse);
    }
}
