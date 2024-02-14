package com.cinewave.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class ShowEntity {

  private long id;
  private LocalDate showDate;
  private LocalTime showTime;
  private float rateMultiplier;
  private Date createdAt;
  private Date updatedAt;
  private MovieEntity movie;
  private TheaterEntity theater;
  private List<TicketEntity> tickets;
  private List<ShowSeatsEntity> seats;
}
