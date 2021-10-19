package com.usa.ciclo3.reto3.services;


import com.usa.ciclo3.reto3.model.Message;
import com.usa.ciclo3.reto3.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageServices {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAll(){

        return messageRepository.getAll();
    }
    public Optional<Message> getMessage(int idMessage){

        return messageRepository.getMessage(idMessage);
    }
    public Message save(Message message){
        if(message.getIdMessage()==null){
            return messageRepository.save(message);
        }else{
            Optional<Message> maux=messageRepository.getMessage(message.getIdMessage());
            if(maux.isEmpty()) {
                return messageRepository.save(message);
            }else{
                return message;
            }
        }
    }
}


