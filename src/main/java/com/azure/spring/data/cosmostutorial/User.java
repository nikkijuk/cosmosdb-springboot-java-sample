package com.azure.spring.data.cosmostutorial;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

import java.util.List;

@Container(containerName = "myContainer", ru = "400")
public class User {

  private String id;
  private String firstName;

  @PartitionKey
  private String lastName;

  private List<Address> addresses;

  public User() {
  }

  public User(String id, String firstName, String lastName, List<Address> addresses) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.addresses = addresses;
  }

  @Override
  public String toString() {
    return String.format("User: %s %s, %s @ %s", firstName, lastName, id, addresses);
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }
}
