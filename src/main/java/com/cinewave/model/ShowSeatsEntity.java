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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "show_seats")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ShowSeatsEntity {

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

  @Column(
    name = "is_booked",
    columnDefinition = "bit(1) default 0",
    nullable = false
  )
  private boolean booked;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "booked_at")
  private Date bookedAt;

  @ManyToOne
  @JsonIgnore
  private ShowEntity show;

  @ManyToOne
  @JsonIgnore
  private TicketEntity ticket;
}
