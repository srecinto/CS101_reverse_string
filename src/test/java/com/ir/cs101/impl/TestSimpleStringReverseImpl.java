package com.ir.cs101.impl;

import org.junit.Test;
import org.junit.Assert;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class TestSimpleStringReverseImpl {
  private static final Logger log = LogManager.getFormatterLogger(TestSimpleStringReverseImpl.class);
  
  @Test
  public void testReverseEvenString(){
    log.debug("testReverseEvenString() Enter");
    
    SimpleStringReverseImpl ssri = new SimpleStringReverseImpl();
    String testStart = "abcd";
    String testExpected = "dcba";
    
    String result = ssri.reverse(testStart);
    
    Assert.assertEquals("Failed to match", testExpected, result);
    
    log.debug("testReverseEvenString() Exit");
  }
  
  @Test
  public void testReverseOddString(){
    log.debug("testReverseOddString() Enter");
    
    SimpleStringReverseImpl ssri = new SimpleStringReverseImpl();
    String testStart = "xyz";
    String testExpected = "zyx";
    
    String result = ssri.reverse(testStart);
    
    Assert.assertEquals("Failed to match", testExpected, result);
    
    log.debug("testReverseOddString() Exit");
  }
  
  @Test
  public void testReverseEmptyString(){
    log.debug("testReverseEmptyString() Enter");
    
    SimpleStringReverseImpl ssri = new SimpleStringReverseImpl();
    String testStart = "";
    String testExpected = "";
    
    String result = ssri.reverse(testStart);
    
    Assert.assertEquals("Failed to match", testExpected, result);
    
    log.debug("testReverseEmptyString() Exit");
  }
  
  @Test
  public void testReverseNullString(){
    log.debug("testReverseNullString() Enter");
    
    SimpleStringReverseImpl ssri = new SimpleStringReverseImpl();
    String testStart = null;
    String testExpected = null;
    
    String result = ssri.reverse(testStart);
    
    Assert.assertEquals("Failed to match", testExpected, result);
    
    log.debug("testReverseNullString() Exit");
  }
  
}
