package app;

import java.util.Date;

import org.apache.log4j.Logger;


public class Script {

	final static Logger logger = Logger.getLogger(Script.class);
	
	public static void main(String[] args) {
		
		logger.info("Debut traitement at : " + new Date().toString());
		System.out.println("Hello " + args[0]);
		logger.info("Fin traitement at : " + new Date().toString());
	}

}
