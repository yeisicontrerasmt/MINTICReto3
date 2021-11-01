package com.usa.ciclo3.reto3.repository;
import java.util.List;
import java.util.Optional;

import com.usa.ciclo3.reto3.crudrepository.MotorbikeCrudRepository;
import com.usa.ciclo3.reto3.model.Motorbike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 *
 * @author USUARIO
 */
@Repository
public class MotorbikeRepository {


        @Autowired
        private MotorbikeCrudRepository motorbikeCrudRepository;

        public List<Motorbike> getAll(){

            return (List<Motorbike>) motorbikeCrudRepository.findAll();
        }

        public Optional<Motorbike> getMotorbike(int id){

            return motorbikeCrudRepository.findById(id);
        }

        public Motorbike save(Motorbike motorbike){

            return motorbikeCrudRepository.save(motorbike);
        }
        public void delete(Motorbike motorbike){

            motorbikeCrudRepository.delete(motorbike);
        }

    }
