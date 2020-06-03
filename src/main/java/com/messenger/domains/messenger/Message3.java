package com.messenger.domains.messenger;

import org.springframework.stereotype.Component;

@Component
public class Message3 implements Messenger {

    @Override
    public String proceedMessage() {
        String output = "Sending message from: " + this.getClass().getSimpleName();
        logger.info(output);
        return output;
    }

    @Override
    public String getType() {
        return "03";
    }
}
