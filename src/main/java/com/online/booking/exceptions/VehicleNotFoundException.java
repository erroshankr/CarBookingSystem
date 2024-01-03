package com.online.booking.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VehicleNotFoundException extends Throwable {

    private static final Logger LOG = LoggerFactory.getLogger( VehicleNotFoundException.class);

    public VehicleNotFoundException(String s) {
        LOG.error(s);
        super.printStackTrace();
    }
}
