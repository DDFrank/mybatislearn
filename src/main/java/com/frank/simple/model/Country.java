package com.frank.simple.model;

/**
 * .Description: Author: 金君良 Date: 2018/11/28 0028 下午 2:19
 */
public class Country {
  private Long id;
  private String countryName;
  private String countryCode;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public void printf() {
    System.out.printf("%-4d%4s%4s\n", this.getId(), this.getCountryName(), this.getCountryCode());
  }
}
