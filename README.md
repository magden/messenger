# messenger
Created Messenger interface, also created Message objects( for illustration I've created 3 different types).
Each of them implements methods of the Messenger with specific text.

Messenger Controller receives type of the message that user wants to proceed.
Example of the request:
url: http://localhost:8080/messenger
body: {"type":"01"}

Controller sends this type to the messenger service, that contains map of possible messages
(type of the message as key and the message as a variable).
After that I extract this message from the map by type and proceed the message. 
This map was initialized in the constructor of the service.
Spring framework injected List of possible "Messengers"(to the constructor parameter) and I've converted this list to the Map.
