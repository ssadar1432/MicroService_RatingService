package com.sach.rating.controller;

import com.sach.rating.entities.Rating;
import com.sach.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    RatingService ratingService;
    @GetMapping("{id}")
    public ResponseEntity<Rating> getRatingByID(@PathVariable int id){
        System.out.println("Test Single Rating");
        return ResponseEntity.status(HttpStatus.FOUND).body(ratingService.getRating(id));

    }
    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelID(@PathVariable int hotelId){

        return ResponseEntity.status(HttpStatus.FOUND).body(ratingService.getRatingByHotelID(hotelId));

    }
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserID(@PathVariable int userId){

        return ResponseEntity.status(HttpStatus.FOUND).body(ratingService.getRatingByUserID(userId));

    }

    @GetMapping("/getAllRating")
    public ResponseEntity<List<Rating>> getAllRating(){
        System.out.println("Test Rating");
        return ResponseEntity.status(HttpStatus.FOUND).body(ratingService.getAllRating());

    }
    @PostMapping
    public ResponseEntity<Rating> addRating(@RequestBody Rating rating){

        Rating rate=ratingService.addRating(rating);

        return ResponseEntity.status(HttpStatus.CREATED).body(rate);

    }

    @PutMapping
    public ResponseEntity<Rating> updateRating(@RequestBody Rating rating){

        Rating rate=ratingService.updateRating(rating);

        return ResponseEntity.status(HttpStatus.CREATED).body(rate);

    }

    @DeleteMapping("{id}")
    public ResponseEntity<Rating> deleteRatingByID(@PathVariable int id){

        return ResponseEntity.status(HttpStatus.FOUND).body(ratingService.deleteRating(id));

    }

}
