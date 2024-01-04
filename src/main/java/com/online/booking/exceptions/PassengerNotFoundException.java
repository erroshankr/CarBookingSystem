package com.online.booking.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PassengerNotFoundException extends Throwable {
    private static final Logger LOG = LoggerFactory.getLogger( PassengerNotFoundException.class);
    public PassengerNotFoundException(String c){
        LOG.error(c);
        super.printStackTrace();
    }
}
