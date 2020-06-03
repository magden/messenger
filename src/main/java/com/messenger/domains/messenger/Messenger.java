package com.messenger.domains.messenger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public interface Messenger {
    Logger logger = LoggerFactory.getLogger(Messenger.class);

    public String proceedMessage();

    public String getType();
}
