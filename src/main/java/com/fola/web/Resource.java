package com.fola.web;

import java.util.UUID;

/**
 * Resource
 */
public class Resource {

  private final String location;
  private final String owner;
  private final UUID uuid;

  public Resource(String location, String owner, UUID uuid) {
    this.location = location;
    this.owner = owner;
    this.uuid = uuid;
  }

  public String getLocation() {
    return location;
  }

  public String getOwner() {
    return owner;
  }

  public UUID getUuid() {
    return uuid;
  }
}