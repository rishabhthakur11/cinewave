package com.cinewave.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class UserEntity implements UserDetails
{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

//  @Column(name = "name", nullable = false)
  private String name;

//  @Column(name = "email", nullable = false)
  private String email;

//  @Column(name = "password", nullable = false)
//  @JsonIgnore
  private String password;

//  @Column(name = "mobile", nullable = false)
  private String mobile;

//  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  private List<TicketEntity> ticketEntities;

@Override
public Collection<? extends GrantedAuthority> getAuthorities() {
	return null;
}

@Override
public String getUsername() 
{
	return this.email;
}

@Override
public boolean isAccountNonExpired() 
{
	return true;
}

@Override
public boolean isAccountNonLocked() 
{
	return true;
}

@Override
public boolean isCredentialsNonExpired() 
{
	return true;
}

@Override
public boolean isEnabled() 
{
	return true;
}
  
  
}
