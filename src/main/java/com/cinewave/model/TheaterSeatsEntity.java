package com.cinewave.model;

import com.cinewave.enums.SeatType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@Entity
@Table(name = "theater_seats")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class TheaterSeatsEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "seat_number", nullable = false)
  private String seatNumber;

  @Column(name = "rate", nullable = false)
  private int rate;

  @Enumerated(EnumType.STRING)
  @Column(name = "seat_type", nullable = false)
  private SeatType seatType;

  @ManyToOne
  @JsonIgnore
  private TheaterEntity theater;
}
