package com.beerservice.web.beerController;

import com.beerservice.web.model.BeerDTO;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/api/v1/beer")
public class BeerMainController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDTO> getBeerById(@PathVariable("beerId") UUID beerId){

        //todo impl
        return new ResponseEntity<>(BeerDTO.builder().build(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity saveNewBeer(@RequestBody @Validated  BeerDTO beerDTO){
        //todo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/update/{beerId}")
    public ResponseEntity updateBeer(@RequestBody @Validated BeerDTO beerDTO, @PathVariable("beerId") UUID beerId){

        //todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
