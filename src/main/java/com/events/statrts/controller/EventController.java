package com.events.statrts.controller;

import com.events.statrts.publisher.BigBangEvent;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/event")
public class EventController {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

@ApiOperation(httpMethod = "POST", value = "Publish BBT event")
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "BBT event published "),
    })
    @PostMapping(value = "/bbt/publish/{espNo}")
    public ResponseEntity<String> publishEvent(
            @ApiParam(
                    name = "espNo",
                    required = true,
                    value = "episod number to be published"
            )@PathVariable(name = "espNo") int espNo
){
    applicationEventPublisher.publishEvent(new BigBangEvent(this,String.valueOf(espNo)));
    return new ResponseEntity<>(HttpStatus.ACCEPTED);
}
}
