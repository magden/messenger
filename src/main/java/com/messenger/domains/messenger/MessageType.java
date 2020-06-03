package com.messenger.domains.messenger;

import org.springframework.stereotype.Component;

/**
 * Represents type of the message to proceed.
 */
@Component
public class MessageType {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
