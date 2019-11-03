package com.fola.web;

import javax.validation.constraints.NotBlank;

/**
 * AccountInfo
 */
public class AccountInfo {

  @NotBlank(message = "Location is required.")
  private String location;
  @NotBlank(message = "Owner is required.")
  private String owner;
  private int id;

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public AccountInfo(String location, String owner, int id) {
    this.location = location;
    this.owner = owner;
    this.id = id;
  }
}