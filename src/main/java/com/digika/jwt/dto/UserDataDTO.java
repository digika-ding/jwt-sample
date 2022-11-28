package com.digika.jwt.dto;

import com.digika.jwt.model.AppUserRole;

import java.util.List;

public class UserDataDTO {
  
  private String username;
  private String email;
  private String password;
  List<AppUserRole> appUserRoles;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<AppUserRole> getAppUserRoles() {
    return appUserRoles;
  }

  public void setAppUserRoles(List<AppUserRole> appUserRoles) {
    this.appUserRoles = appUserRoles;
  }
}
