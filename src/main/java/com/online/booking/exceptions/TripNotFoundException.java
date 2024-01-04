package com.online.booking.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TripNotFoundException extends Throwable{
    private static final Logger LOG = LoggerFactory.getLogger( TripNotFoundException.class);

    public TripNotFoundException(String s) {
        LOG.error(s);
        super.printStackTrace();
    }
}

