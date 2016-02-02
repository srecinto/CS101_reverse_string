package com.ir.cs101.core.impl;

import com.ir.cs101.core.StringReverse;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LoopAndTempStringReverseImpl implements StringReverse {
  private static final Logger log = LogManager.getFormatterLogger(LoopAndTempStringReverseImpl.class);
  
  @Override
  /// To me this is the most efficent way to process a string reverse from a memory and performace way...
  /// We duplicate the string to a char array one time, then loop through half of the string to perform the swap, 
  /// finally creating a new string with the swap... remember strings are immutable ;)
  public String reverse(String source) {
    log.debug("reverse(String source) Enter");

    String results = null;
    
    if(source != null) {
      char[] sourceArray = source.toCharArray();
      char tempLeftChar;
      
      int leftPosition = 0;
      int maxPositionCheck = sourceArray.length / 2;
      while(leftPosition < maxPositionCheck) {
        int rightPosition = sourceArray.length - 1 - leftPosition;
        tempLeftChar = sourceArray[leftPosition];
        sourceArray[leftPosition] = sourceArray[rightPosition];
        sourceArray[rightPosition] = tempLeftChar;
        
        leftPosition++;
      }
      
      results = new String(sourceArray);
    }
    
    log.debug("reverse(String source) Exit");
    return results;
  }
}