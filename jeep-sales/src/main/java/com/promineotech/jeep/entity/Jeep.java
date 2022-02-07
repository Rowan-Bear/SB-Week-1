package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Jeep {
  
  private Long modelPK;
  
  private JeepModel modelId;
  
  private String trimLevel;
  
  private int numDoors;
  
  private int wheelSize;
  
  private BigDecimal basePrice;

  public Long getModelPK() {
    return modelPK;
  }

  public void setModelPK(Long modelPK) {
    this.modelPK = modelPK;
  }

  public String getTrimLevel() {
    return trimLevel;
  }

  public void setTrimLevel(String trimLevel) {
    this.trimLevel = trimLevel;
  }

  public int getNumDoors() {
    return numDoors;
  }

  public void setNumDoors(int numDoors) {
    this.numDoors = numDoors;
  }

  public JeepModel getModelId() {
    return modelId;
  }

  public void setModelId(JeepModel modelId) {
    this.modelId = modelId;
  }

  public int getWheelSize() {
    return wheelSize;
  }

  public void setWheelSize(int wheelSize) {
    this.wheelSize = wheelSize;
  }

  public BigDecimal getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(BigDecimal basePrice) {
    this.basePrice = basePrice;
  }
  
}

