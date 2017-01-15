package com.prabhu.boot;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * <p>
 *
 * </p>
 *
 * @author Prabhu R Babu (1/15/17 10:33 AM)
 */
@ApplicationPath("rest")
public class SampleRestApplication extends ResourceConfig{

  public SampleRestApplication() {
    //register for scan: package with resource classes
    packages("com.prabhu.rest");
  }
}
