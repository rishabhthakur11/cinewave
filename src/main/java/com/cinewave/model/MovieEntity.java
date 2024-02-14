package com.cinewave.model;

import com.cinewave.model.enums.CertificateType;
import com.cinewave.model.enums.MovieLanguage;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MovieEntity {

  private long id;
  private String name;
  private MovieLanguage language;
  private CertificateType certificateType;
  private LocalDate releaseDate;
  private List<ShowEntity> shows = new ArrayList<>();
}
