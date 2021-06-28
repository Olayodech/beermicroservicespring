package com.beerservice.bootstraps;

import com.beerservice.domain.Beer;
import com.beerservice.repositories.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

//ON START UP, THIS WILL LOAD DATA SHOULD THERE BE NONE
@Component
public class BeerLoader implements CommandLineRunner {

    @Autowired
    private BeerRepository beerRepository;

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
            .beerName("Mango")
                    .beerStyle("ALE")
                    .minOnHand(12)
                    .quantityToBrew(200)
                    .upc(3370100000001L)
                    .price(new BigDecimal("12.5"))
            .build());

            beerRepository.save(Beer.builder()
                    .beerName("Corona beer")
                    .beerStyle("STOUT")
                    .minOnHand(12)
                    .quantityToBrew(200)
                    .upc(3370100000002L)
                    .price(new BigDecimal("11.95"))
                    .build());
        }
    }
}
