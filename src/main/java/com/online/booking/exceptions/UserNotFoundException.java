package com.online.booking.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserNotFoundException extends Throwable {

    private static final Logger LOG = LoggerFactory.getLogger(UserNotFoundException.class);

    public UserNotFoundException(String msg) {
        LOG.error(msg);
        super.printStackTrace();
    }
}
