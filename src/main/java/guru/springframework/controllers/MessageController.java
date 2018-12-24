package guru.springframework.controllers;

import guru.springframework.domain.Message;
import guru.springframework.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/api/v1/message", method = RequestMethod.GET)
    public List<Message> getMessages() {
        return messageService.listAll();
    }

    @RequestMapping(value = "/api/v1/message", method = RequestMethod.POST)
    public Message postOrUpdateMessage(@RequestBody Message message) {
        messageService.saveOrUpdate(message);
        return message;
    }


    @RequestMapping(value = "/api/v1/message", method = RequestMethod.PUT)
    public List<Message> updateMessage() {
        List<Message> messages = new ArrayList<Message>();
        messages.add(new Message());
        return messages;
    }


    @RequestMapping(value = "/api/v1/message", method = RequestMethod.DELETE)
    public List<Message> deleteMessage() {
        List<Message> messages = new ArrayList<Message>();
        messages.add(new Message());
        return messages;
    }
}
