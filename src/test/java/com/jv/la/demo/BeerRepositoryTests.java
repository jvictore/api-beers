package com.jv.la.demo;

import com.jv.la.demo.model.beer.BeerModel;
import com.jv.la.demo.repository.BeerRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.springframework.test.util.AssertionErrors.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BeerRepositoryTests {

    private static final BeerModel insertData = new BeerModel("testName","testType");
    @Autowired
    BeerRepository beerRepository;

//    @Test
//    @Order(1)
//    void shouldBeInsertOneResult(){
//        assertEquals("Cannot insert data: ", insertData, beerRepository.save(insertData));
//    }
//
//    @Test
//    @Order(2)
//    void shouldBeReturnOneResultByName(){
//        List<BeerModel> dataAssert = beerRepository.findByName(insertData.getName());
//        assertEquals("Test shouldBeReturnOneResultByName return: ", insertData.getName(), dataAssert.get(0).getName());
//    }
//
//    @Test
//    @Order(3)
//    void shouldBeReturnOneResultByType(){
//        List<BeerModel> dataAssert = beerRepository.findByType(insertData.getType());
//        assertEquals("Test shouldBeReturnOneResultByName return: ", insertData.getType(), dataAssert.get(0).getType());
//    }
//
//    @Test
//    @Order(4)
//    void shouldBeReturnOneResultById(){
//        Optional<BeerModel> dataAssert = beerRepository.findById(insertData.getId());
//        assertNotNull("Test shouldBeReturnOneResultById return: ", dataAssert);
//    }
//
//    @Test
//    @Order(5)
//    void shouldBeNotReturnResult(){
//        Optional<BeerModel> dataAssert = beerRepository.findById(0);
//        assertNotEquals("Test shouldBeNotReturnResult return: ", insertData, dataAssert);
//    }
//
//    @Test
//    @Order(6)
//    void shouldBeReturnListResults(){
//        List<BeerModel> dataAssert = (List<BeerModel>) beerRepository.findAll();
//        assertNotNull("Test shouldBeReturnListResults return: ", dataAssert);
//    }
//
//    @Test
//    @Order(7)
//    void shouldBeUpdateTypeResult(){
//        BeerModel dataAssert = beerRepository.findById(insertData.getId()).get();
//        dataAssert.setType("testTypeUpdate");
//        beerRepository.save(dataAssert);
//        assertNotEquals("Test shouldBeUpdateTypeResult return: ", insertData, dataAssert);
//    }
//
//    @Test
//    @Order(8)
//    void shouldBeUpdateNameResult(){
//        BeerModel dataAssert = beerRepository.findById(insertData.getId()).get();
//        dataAssert.setName("testNameUpdate");
//        beerRepository.save(dataAssert);
//        BeerModel dataAssertUpdated = beerRepository.findById(dataAssert.getId()).get();
//        assertNotEquals("Test shouldBeUpdateNameResult return: ", insertData, dataAssertUpdated);
//        insertData.setName("testNameUpdate");
//    }
//
//
//    @Test
//    @Order(9)
//    void shouldBeRemoveById(){
//        Boolean test = beerRepository.deleteById(insertData.getId());
//        assertNull("Test shouldBeRemoveById return: ", test);
//    }
}
