#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ${package}.model.HelloMessage;

/**
 * This class represents the Hello World resource.
 * The comment for the getHelloMessage method is intentionally missing
 * @author ruud
 *
 */
@Path("/helloworld")
public class HelloWorldResource {
	
	@GET
	public HelloMessage getHelloMessage() {
		HelloMessage msg = new HelloMessage();
		msg.setUsername("Ruud Greven");
		return msg;
	}
}
