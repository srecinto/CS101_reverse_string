package com.ir.cs101.core.impl;

import com.ir.cs101.core.StringReverse;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class RecursiveStringReverseImpl implements StringReverse {
  private static final Logger log = LogManager.getFormatterLogger(RecursiveStringReverseImpl.class);

  @Override
  public String reverse(String source) {
    log.debug("reverse(String source) Enter");

    String results = null;
    if(source != null) {
      results = new String(reverse(source.toCharArray(), 0));
    }
      
    log.debug("reverse(String source) Exit");
    return results;
  }
  
  private char[] reverse(char[] source, int leftPosition) {
    log.debug("reverse(String source, int position) Enter");
    if(log.isDebugEnabled()) {log.debug("source: " + new String(source) + " leftPosition: " + leftPosition);}
    
    int maxPositionCheck = (source.length / 2);
    log.debug("maxPositionCheck: " + maxPositionCheck);
    
    if(leftPosition < maxPositionCheck) {
      int rightPosition = (source.length - 1) - leftPosition;
      char tempLeftChar = source[leftPosition];
      //Not a fan of directly editing a parameter
      source[leftPosition] = source[rightPosition];
      source[rightPosition] = tempLeftChar;
      

      leftPosition++;
      source = reverse(source, leftPosition);
    } 
    
    log.debug("reverse(String source, int position) Exit");
    return source;
  }
  
  
}
