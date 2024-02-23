package com.cinewave.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Getter
@Setter
@Entity
//@Table(name = "shows")
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ShowEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "show_date", columnDefinition = "DATE", nullable = false)
  private LocalDate showDate;

  @Column(name = "show_time", columnDefinition = "TIME", nullable = false)
  private LocalTime showTime;

  @Column(
    name = "rate_multiplier",
    columnDefinition = "float(2,1) default 1.0",
    nullable = false
  )
  private float rateMultiplier;

  @Temporal(TemporalType.TIMESTAMP)
  @CreatedDate
  @Column(name = "created_at")
  private Date createdAt;

  @Temporal(TemporalType.TIMESTAMP)
  @LastModifiedDate
  @Column(name = "updated_at")
  private Date updatedAt;

  @ManyToOne
  @JsonIgnore
  private MovieEntity movie;

  @ManyToOne
  @JsonIgnore
  private TheaterEntity theater;

  @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
  @JsonIgnore
  private List<TicketEntity> tickets;

  @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
  @JsonIgnore
  private List<ShowSeatsEntity> seats;
}
