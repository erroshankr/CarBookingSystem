package com.online.booking.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvalidLocationException extends Throwable {
    private static final Logger LOG = LoggerFactory.getLogger( InvalidLocationException.class);

    public InvalidLocationException(String s) {
        LOG.error(s);
        super.printStackTrace();
    }
}
