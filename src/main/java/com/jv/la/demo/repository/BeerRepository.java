package com.jv.la.demo.repository;

import com.jv.la.demo.model.beer.BeerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BeerRepository extends JpaRepository<BeerModel, Integer> {

    List<BeerModel> findByName(String name);
    List<BeerModel> findByType(String type);


//    Boolean deleteById(int id);

}
