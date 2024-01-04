package com.online.booking.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PassengerNotFoundException extends Throwable {
    private static final Logger LOG = LoggerFactory.getLogger( PassengerNotFoundException.class);
    public PassengerNotFoundException(String b){
        LOG.error(b);
        super.printStackTrace();
    }
}
