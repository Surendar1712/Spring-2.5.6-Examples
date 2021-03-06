package com.required.annotation.ex.beans;

import org.springframework.beans.factory.annotation.Required;

public class Customer {

  private int customerId;
  private String type;
  private Person person;

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Person getPerson() {
    return person;
  }

  @Required
  public void setPerson(Person person) {
    this.person = person;
  }

  @Override
  public String toString() {
    return "Customer [customerId=" + customerId + ", type=" + type + ", person=" + person + "]";
  }

}
