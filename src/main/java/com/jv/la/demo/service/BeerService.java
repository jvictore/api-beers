package com.jv.la.demo.service;


import com.jv.la.demo.EmptyFieldException;
import com.jv.la.demo.EmptyListException;
import com.jv.la.demo.NullFieldException;
import com.jv.la.demo.model.beer.BeerModel;
import com.jv.la.demo.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class BeerService {
    @Autowired
    private BeerRepository beerRepository;

    public Iterable<BeerModel> getBeer() throws EmptyListException {
        Iterable<BeerModel> result = beerRepository.findAll();
        if (((Collection<?>) result).size() > 0){
            return result;
        } else {
            throw new EmptyListException("No content");
        }
    }

    public Optional<BeerModel> getBeerById(int id){
        return beerRepository.findById(id);
    }

    public BeerModel addBeer(BeerModel body) throws EmptyFieldException, NullFieldException {
        if (body.getType() == null || body.getName() == null){
            throw new NullFieldException("Missing field.");
        }

        if (body.getName().isEmpty() || body.getType().isEmpty()){
            throw new EmptyFieldException("Empty field");
        }
        return beerRepository.save(body);
    }

    public void removeBeer(int id){
        beerRepository.deleteById(id);
    }

    public boolean updateBeer(int id, BeerModel body){
        BeerModel beer = beerRepository.findById(id).get();
        if (beer.getId() != 0){
            if (!body.getName().equals("")){
                beer.setName(body.getName());
            }
            if (!body.getType().equals("")){
                beer.setType(body.getType());
            }
            beerRepository.save(beer);
        }
        return true;
    }


}
