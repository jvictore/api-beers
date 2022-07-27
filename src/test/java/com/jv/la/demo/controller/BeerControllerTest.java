package com.jv.la.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jv.la.demo.model.beer.BeerModel;
import com.jv.la.demo.repository.BeerRepository;
import com.jv.la.demo.service.BeerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.RestDocsRestAssuredConfigurationCustomizer;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.CoreMatchers.is;


@WebMvcTest(controllers = BeerController.class)
@ActiveProfiles("test")
class BeerControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BeerService beerService;

    @Autowired
    private ObjectMapper objectMapper;

    private List<BeerModel> beerList = new ArrayList<>();

    @BeforeEach
    void setup(){
        this.beerList.add(new BeerModel("skol", "IPA"));
        this.beerList.add(new BeerModel("brahma", "IPA"));
    }

//    @Test
//    void getBeer() throws Exception {
//        given(beerService.getBeer()).willReturn(this.beerList);
//        this.mockMvc.perform( get("/beer"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.size()", is(this.beerList.size())));
//    }

//    @Test
//    void getBeerById() throws Exception {
//        final int beerId = 1;
//        final BeerModel beer = new BeerModel("skol", "IPA");
//
//        given(beerService.getBeerById(beerId)).willReturn(Optional.of(beer));
//
//        this.mockMvc.perform(get("/beer/{id}", beerId))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name", is(beer.getName())))
//                .andExpect(jsonPath("$.type", is(beer.getType())));
//    }

//
//    @Test
//    void addBeer() throws Exception {
//        final BeerModel beer = new BeerModel("itaipava", "IPA");
//
//        given(beerService.addBeer(beer)).willReturn(true);
//
//        this.mockMvc.perform(post("/beer/add")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(beer)))
//                .andExpect(status().isCreated())
//                .andExpect(jsonPath("$.name", is(beer.getName())))
//                .andExpect(jsonPath("$.type", is(beer.getType())));
//    }

//    @Test
//    void removeBeer() throws Exception {
//        int id = 2;
//        given(beerService.removeBeer(2)).willReturn(Boolean.TRUE);
//
//        this.mockMvc.perform(delete("/beer/remove/{id}", id))
//                .andExpect(status().isOk());
//    }


//    @Test
//    void updateBeer() throws Exception{
//        final BeerModel body = new BeerModel("Colorado", "IPA");
//        int id = 0;
//        given(beerService.updateBeer(id, body)).willReturn(Boolean.TRUE);
//
//        this.mockMvc.perform(put("/beer/update/{id}", id)
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsString(body)))
//                .andExpect(status().isOk());
//    }

}