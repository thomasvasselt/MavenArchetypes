#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("resources")
public class MyResourceConfig extends ResourceConfig {

    public MyResourceConfig() {
        packages("${package}.resources");
    }
}