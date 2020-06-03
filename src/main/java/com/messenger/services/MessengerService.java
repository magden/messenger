package com.messenger.services;

import com.messenger.domains.messenger.MessageType;

public interface MessengerService {

     String sendMessage(MessageType messageType);
}
