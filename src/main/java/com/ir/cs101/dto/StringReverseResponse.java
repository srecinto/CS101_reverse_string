package com.ir.cs101.dto;

public class StringReverseResponse {
  
  public StringReverseResponse(String originalString, String reversedString) {
    this.setOriginalString(originalString);
    this.setReversedString(reversedString);
  }
  
  private String reversedString;
  private String originalString;
  
  public String getReversedString() {
    return reversedString;
  }
  
  public void setReversedString(String reversedString) {
    this.reversedString = reversedString;
  }
  
  public String getOriginalString() {
    return originalString;
  }
  
  public void setOriginalString(String originalString) {
    this.originalString = originalString;
  }
  
}
