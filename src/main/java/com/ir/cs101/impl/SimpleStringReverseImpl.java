package com.ir.cs101.impl;

import com.ir.cs101.StringReverse;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * This is the simple lazy way to reverse a string
 */ 
public class SimpleStringReverseImpl implements StringReverse {
  private static final Logger log = LogManager.getFormatterLogger(SimpleStringReverseImpl.class);
  
  public String reverse(String source){
    log.debug("reverse(String source) Enter");
    String result = null;
    
    if(source != null) {
      if (log.isDebugEnabled()) {log.debug("source: '" + source + "'");}
      
      char[] reverseChars = new char[source.length()];
      char[] sourceChars = source.toCharArray();

      for(int i = 0; i < sourceChars.length; i++) {
        int reverseIndex = sourceChars.length - 1 - i;
        reverseChars[reverseIndex] = sourceChars[i];
      }
      
      result = new String(reverseChars);
      
      if (log.isDebugEnabled()) {log.debug("result: '" + result + "'");}
    }
    
    log.debug("reverse(String source) Exit");
    return result;
  }
  
}