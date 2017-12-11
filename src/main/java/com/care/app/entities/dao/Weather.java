package com.care.app.entities.dao;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.care.app.entities.embeddable.Cloud;
import com.care.app.entities.embeddable.Location;
import com.care.app.entities.embeddable.Wind;

/**
 * Weather
 */
@Entity
public class Weather {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(columnDefinition = "SMALLINT(3)")
  private Integer code;

  @Column(columnDefinition = "VARCHAR(55)")
  private String definition;

  @Column(columnDefinition = "VARCHAR(15)")
  private String description;

  @Column(columnDefinition = "FLOAT(3,2)")
  private Float temprature;

  @Column(columnDefinition = "SMALLINT(3)")
  private Short pressure;

  @Column(columnDefinition = "TINYINT(3)")
  private Byte humadity;

  @Embedded
  private Cloud cloud;

  @Embedded
  private Location location;

  @Embedded
  private Wind wind;

  @ManyToOne(targetEntity = City.class)
  private City city;

  /**
   * @param id the id to set
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * @param city the city to set
   */
  public void setCity(City city) {
    this.city = city;
  }

  /**
   * @return the city
   */
  public City getCity() {
    return city;
  }

  /**
   * @param cloud the cloud to set
   */
  public void setCloud(Cloud cloud) {
    this.cloud = cloud;
  }

  /**
   * @return the cloud
   */
  public Cloud getCloud() {
    return cloud;
  }

  /**
   * @param code the code to set
   */
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * @return the code
   */
  public Integer getCode() {
    return code;
  }

  /**
   * @param definition the definition to set
   */
  public void setDefinition(String definition) {
    this.definition = definition;
  }

  /**
   * @return the definition
   */
  public String getDefinition() {
    return definition;
  }

  /**
   * @param description the description to set
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param humadity the humadity to set
   */
  public void setHumadity(Byte humadity) {
    this.humadity = humadity;
  }

  /**
   * @return the humadity
   */
  public Byte getHumadity() {
    return humadity;
  }

  /**
   * @param location the location to set
   */
  public void setLocation(Location location) {
    this.location = location;
  }

  /**
   * @return the location
   */
  public Location getLocation() {
    return location;
  }

  /**
   * @param pressure the pressure to set
   */
  public void setPressure(Short pressure) {
    this.pressure = pressure;
  }

  /**
   * @return the pressure
   */
  public Short getPressure() {
    return pressure;
  }

  /**
   * @param temprature the temprature to set
   */
  public void setTemprature(Float temprature) {
    this.temprature = temprature;
  }

  /**
   * @return the temprature
   */
  public Float getTemprature() {
    return temprature;
  }

  /**
   * @param wind the wind to set
   */
  public void setWind(Wind wind) {
    this.wind = wind;
  }

  /**
   * @return the wind
   */
  public Wind getWind() {
    return wind;
  }
}