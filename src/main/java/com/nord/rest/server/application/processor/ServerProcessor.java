package com.nord.rest.server.application.processor;

import com.nord.rest.server.application.model.ServerRequest;
import com.nord.rest.server.application.model.ServerResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class ServerProcessor {

    private static final Logger LOGGER = LogManager.getLogger(ServerProcessor.class);

    public ServerResponse send(ServerRequest request) {
        LOGGER.info("rest-server-application-Processor ===== ===== Started\n");

        final ServerResponse response = buildResponse(request);

        LOGGER.info("rest-server-application-Processor ===== ===== Completed\n\n\n");
        return response;
    }

    private ServerResponse buildResponse(ServerRequest request) {
        final ServerResponse response = new ServerResponse();
        response.setId(request.getId());
        response.setContent(request.getType());
        return response;
    }
}
