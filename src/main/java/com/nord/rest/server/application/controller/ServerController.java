package com.nord.rest.server.application.controller;

import com.nord.rest.server.application.model.ServerRequest;
import com.nord.rest.server.application.model.ServerResponse;
import com.nord.rest.server.application.processor.ServerProcessor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    private static final Logger LOGGER = LogManager.getLogger(ServerController.class);

    @Autowired
    private ServerProcessor processor;

    @PostMapping(value = "/server/receive",
            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ServerResponse serverReceive(@RequestBody ServerRequest request) {
        LOGGER.info("rest-server-application-Controller ===== ===== Started\n");
        LOGGER.info(request + "\n");

        final ServerResponse response = processor.send(request);

        LOGGER.info(response + "\n");
        LOGGER.info("rest-server-application-Controller ===== ===== Completed\n\n\n");
        return response;
    }
}
