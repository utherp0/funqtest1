package org.uth.funqtest.funqy.cloudevent;

import io.quarkus.funqy.Funq;

public class CloudEventGreeting 
{
  @Funq
  public String event1( Object input )
  {
      System.out.println( "In Event1");
    return( "Processed by event 1:" + input );
  }

  @Funq
  public String event2( Object input )
  {
    System.out.println( "In Event2");  
    return( "Processed by event 2:" + input );
  }
}
