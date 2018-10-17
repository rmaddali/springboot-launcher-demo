package io.openshift.booster.service;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.stereotype.Component;

@Path("/demo")
@Component
public class DemoEndpoint {
    @GET
    @Produces("application/json")
    public Greeting greeting(@QueryParam("name") @DefaultValue("World") String name) {
        final String message = String.format(Greeting.FORMAT, name);
        
        
        
        return new Greeting("Welcome to OCP");
    }
}