package com.cinewave.model;

import com.cinewave.model.enums.SeatType;
import java.util.Date;

public class ShowSeatsEntity {

  private long id;
  private String seatNumber;
  private int rate;
  private SeatType seatType;
  private boolean booked;
  private Date bookedAt;
  private ShowEntity show;
  private TicketEntity ticket;
}
