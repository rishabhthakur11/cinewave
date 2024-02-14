package com.cinewave.model;

import com.cinewave.enums.SeatType;

public class TheaterSeatsEntity {

  private long id;
  private String seatNumber;
  private int rate;
  private SeatType seatType;
  private TheaterEntity theater;
}
