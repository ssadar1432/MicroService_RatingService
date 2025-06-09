package com.sach.rating.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Rating")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private int ratingId;
    @Column(name="USER_ID")
    private int userId;
    @Column(name="HOTEL_ID")
    private  int hotelId;
    @Column(name="FEEDBACK")
    private String feedback;

    @Column(name="RATE")
    private int rating;


}
