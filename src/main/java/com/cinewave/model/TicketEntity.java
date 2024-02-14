package com.cinewave.model;

import java.util.Date;
import java.util.List;

public class TicketEntity {

  private long id;
  private String allottedSeats;
  private double amount;
  private Date bookedAt;
  private UserEntity user;
  private ShowEntity show;
  private List<ShowSeatsEntity> seats;
}
