package com.maven.logging_epamtask;
import org.apache.log4j.Logger;
public class Main {
	static Logger log = Logger.getLogger(Main.class.getName());
    public static void main( String[] args )
    {
    	Interest.calculateInterest();
        Construction.costEvaluator();
    }
}
