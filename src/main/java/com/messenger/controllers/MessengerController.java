package com.messenger.controllers;

import com.messenger.domains.messenger.MessageType;
import com.messenger.services.MessengerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messenger")
public class MessengerController {


    private MessengerService messengerService;

    public MessengerController(MessengerService messengerService) {
        this.messengerService = messengerService;
    }

    /**
     * @param messageType Requested from the user that contains type of the message to return
     * @return message that proceed by specific type
     */
    @GetMapping
    public String proceedMessage(@RequestBody MessageType messageType) {
        return messengerService.sendMessage(messageType);
    }
}
