package com.logicalis.la.demo.service;


import com.logicalis.la.demo.model.beer.BeerModel;
import com.logicalis.la.demo.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Service
public class BeerService {
    @Autowired
    private BeerRepository beerRepository;

    public Iterable<BeerModel> getBeer() {
        return beerRepository.findAll();
    }

    public Optional<BeerModel> getBeerById(int id){
        return beerRepository.findById(id);
    }

    public boolean addBeer(BeerModel body){
        beerRepository.save(body);
        return true;
    }

    public Boolean removeBeer(int id){
        return beerRepository.deleteById(id);
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
