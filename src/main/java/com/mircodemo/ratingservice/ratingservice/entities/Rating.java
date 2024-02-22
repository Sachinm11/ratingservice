package com.mircodemo.ratingservice.ratingservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ratings")
public class Rating {

    @Id
    private String ratingId;
    private String hotelId;
    private String userId;
    private int rating;
    private String feedback;
}
