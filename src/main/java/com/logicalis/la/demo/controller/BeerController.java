package com.logicalis.la.demo.controller;

import com.logicalis.la.demo.model.beer.BeerModel;
import com.logicalis.la.demo.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path = "/beer")
public class BeerController {
    @Autowired
    private BeerService beerService;

    @GetMapping
    public @ResponseBody Iterable<BeerModel> getBeer(){
        return beerService.getBeer();
    }

//    @GetMapping("/{id}")
//    public @ResponseBody Optional<BeerModel> getBeerById(@PathVariable("id") int id){
//        return beerService.getBeerById(id);
//    }
//
//    @PostMapping("/add")
//    public @ResponseBody ResponseEntity<BeerModel> addBeer(@RequestBody BeerModel body){
//        if (beerService.addBeer(body)){
//            return ResponseEntity.status(HttpStatus.CREATED).body(body);
//        }
//        return ResponseEntity.badRequest().build();
//
//    }
//
//    @DeleteMapping ("/remove/{id}")
//    public @ResponseBody ResponseEntity<String> removeBeer(@PathVariable("id") int id){
//        if (beerService.removeBeer(id)){
//            return ResponseEntity.ok("Deleted.");
//        } else {
//            return ResponseEntity.notFound().build(); // não é ok
//        }
//    }
//
//    @PutMapping ("/update/{id}")
//    public @ResponseBody ResponseEntity<BeerModel> updateBeer(@PathVariable("id") int id, @RequestBody BeerModel body){
//       if (beerService.updateBeer(id, body)){
//           return ResponseEntity.status(HttpStatus.OK).body(body);
//       }
//       return ResponseEntity.status(HttpStatus.ACCEPTED).body(body);
//    }

}
