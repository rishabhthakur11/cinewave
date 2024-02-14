package com.cinewave.model;

import com.cinewave.model.enums.TheaterType;
import java.util.ArrayList;
import java.util.List;

public class TheaterEntity {

  private long id;
  private String name;
  private TheaterType type;
  private String city;
  private String address;
  private List<ShowEntity> shows = new ArrayList<>();
  private List<TheaterSeatsEntity> seats = new ArrayList<>();
}
