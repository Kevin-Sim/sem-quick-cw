package com.napier.sem;

/**
 * Represents a city from the world database
 */
public class City {

  private long id;
  private String name;
  private String countryCode;
  private String district;
  private long population;

  public City(long id, String name, String countryCode, String district, long population) {
    this.id = id;
    this.name = name;
    this.countryCode = countryCode;
    this.district = district;
    this.population = population;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public String getDistrict() {
    return district;
  }

  public long getPopulation() {
    return population;
  }

  @Override
  public String toString() {
    return "City{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", countryCode='" + countryCode + '\'' +
            ", district='" + district + '\'' +
            ", population=" + population +
            '}';
  }
}