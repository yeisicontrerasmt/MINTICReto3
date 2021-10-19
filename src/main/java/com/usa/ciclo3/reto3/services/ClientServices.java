package com.usa.ciclo3.reto3.services;

import com.usa.ciclo3.reto3.model.Client;
import com.usa.ciclo3.reto3.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServices{

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.getAll();
    }
    public Optional<Client> getClient(int idClient){

        return clientRepository.getClient(idClient);
    }
    public Client save(Client client){
        if(client.getIdClient()==null){
            return clientRepository.save(client);
        }else{
            Optional<Client> caux=clientRepository.getClient(client.getIdClient());
            if(caux.isEmpty()) {
                return clientRepository.save(client);
            }else{
                return client;
            }
        }
    }
}
