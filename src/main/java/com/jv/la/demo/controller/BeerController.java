package com.jv.la.demo.controller;

import com.jv.la.demo.EmptyFieldException;
import com.jv.la.demo.EmptyListException;
import com.jv.la.demo.NullFieldException;
import com.jv.la.demo.model.beer.BeerModel;
import com.jv.la.demo.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.Optional;

@Controller
@RequestMapping(path = "/beer")
public class BeerController {
    @Autowired
    private BeerService beerService;

    @GetMapping
    public @ResponseBody Iterable<BeerModel> getBeer() throws EmptyListException {
        return beerService.getBeer();
    }
    // not found OK
    // method not allowed OK
    // no content OK

    @GetMapping("/{id}")
    public @ResponseBody ResponseEntity<Optional<BeerModel>> getBeerById(@PathVariable("id") int id){
        Optional<BeerModel> founded = beerService.getBeerById(id);

        if (founded.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(founded);
        } else {
            throw new EmptyResultDataAccessException(1);
        }
    }
    // not found OK
    // method not allowed OK

    @PostMapping("/add")
    public @ResponseBody ResponseEntity<BeerModel> addBeer(@RequestBody BeerModel body) throws EmptyFieldException, NullFieldException {
        BeerModel added = beerService.addBeer(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(added);
    }
    // method not allowed OK
    // null field OK
    // empty field OK

    @DeleteMapping ("/remove/{id}")
    public @ResponseBody ResponseEntity<String> removeBeer(@PathVariable("id") int id){
        beerService.removeBeer(id);
        return ResponseEntity.ok("Deleted.");
    }
    // not found OK
    // method not allowed

    @PutMapping ("/update/{id}")
    public @ResponseBody ResponseEntity<BeerModel> updateBeer(@PathVariable("id") int id, @RequestBody BeerModel body){
       if (beerService.updateBeer(id, body)){
           return ResponseEntity.status(HttpStatus.OK).body(body);
       }
       return ResponseEntity.status(HttpStatus.ACCEPTED).body(body);
    }
    // not found OK
    // method not allowed
}
