package com.qa.logging;

//import org.apache.logging.log4j.core.*;
import java.io.*;
import java.sql.SQLException;
import java.util.logging.Logger;

public class HelloWorld {

	static Logger log = Logger.getLogger(HelloWorld.class.getName());

	public static void main(String[] args) throws IOException, SQLException {

		// log.debug("Hello this is an debug message");
		log.info("Hello this is an info message");
		log.warning("This is your last warning...");
		log.warning("Enough Eylem, please go to sleep now!!!");
	}
}
