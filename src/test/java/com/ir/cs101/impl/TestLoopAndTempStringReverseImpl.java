package com.ir.cs101.impl;

import org.junit.Test;
import org.junit.Assert;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class TestLoopAndTempStringReverseImpl {
  private static final Logger log = LogManager.getFormatterLogger(TestLoopAndTempStringReverseImpl.class);
  
  @Test
  public void testReverseEvenString(){
    log.debug("testReverseEvenString() Enter");
    
    LoopAndTempStringReverseImpl sri = new LoopAndTempStringReverseImpl();
    String testStart = "abcd";
    String testExpected = "dcba";
    
    String result = sri.reverse(testStart);
    
    Assert.assertEquals("Failed to match", testExpected, result);
    
    log.debug("testReverseEvenString() Exit");
  }
  
  @Test
  public void testReverseOddString(){
    log.debug("testReverseOddString() Enter");
    
    LoopAndTempStringReverseImpl sri = new LoopAndTempStringReverseImpl();
    String testStart = "xyz";
    String testExpected = "zyx";
    
    String result = sri.reverse(testStart);
    
    Assert.assertEquals("Failed to match", testExpected, result);
    
    log.debug("testReverseOddString() Exit");
  }
  
  @Test
  public void testReverseEmptyString(){
    log.debug("testReverseEmptyString() Enter");
    
    LoopAndTempStringReverseImpl sri = new LoopAndTempStringReverseImpl();
    String testStart = "";
    String testExpected = "";
    
    String result = sri.reverse(testStart);
    
    Assert.assertEquals("Failed to match", testExpected, result);
    
    log.debug("testReverseEmptyString() Exit");
  }
  
  @Test
  public void testReverseNullString(){
    log.debug("testReverseNullString() Enter");
    
    LoopAndTempStringReverseImpl sri = new LoopAndTempStringReverseImpl();
    String testStart = null;
    String testExpected = null;
    
    String result = sri.reverse(testStart);
    
    Assert.assertEquals("Failed to match", testExpected, result);
    
    log.debug("testReverseNullString() Exit");
  }
  
}
