package com.messenger.services;

import com.messenger.domains.messenger.MessageType;
import com.messenger.domains.messenger.Messenger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class MessengerServiceImpl implements MessengerService {

    Logger logger = LoggerFactory.getLogger(MessengerServiceImpl.class);

    private final Map<String, Messenger> messengersMap = new TreeMap<>();

    public MessengerServiceImpl(List<Messenger> messengers) {
        //inits messenger map
        for (Messenger messenger : messengers) {
            messengersMap.put(messenger.getType(), messenger);
        }
    }

    /**
     * @param messageType Message type to proceed
     * @return Specific message by type, or error message if doesn't exist
     */
    @Override
    public String sendMessage(MessageType messageType) {
        String type = messageType.getType();
        Messenger messenger = messengersMap.get(type);
        if (messenger != null) {
            return messenger.proceedMessage();
        } else {
            String errorMessage = "Failed to proceed message. Message type '" + type + "' is not exist.";
            logger.error(errorMessage);
            return errorMessage;
        }
    }
}
