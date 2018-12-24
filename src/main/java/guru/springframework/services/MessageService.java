package guru.springframework.services;

import guru.springframework.domain.Message;

import java.util.List;

public interface MessageService {

    List<Message> listAll();

    Message getById(Long id);

    Message saveOrUpdate(Message product);

    void delete(Long id);

}
