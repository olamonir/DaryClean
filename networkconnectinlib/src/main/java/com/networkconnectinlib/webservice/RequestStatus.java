package com.networkconnectinlib.webservice;

/**
 *
 * Determine the request status.
 */
public enum RequestStatus {

    SUCCEED, // Request succeed
    FAILED, // Request failed
    NO_CONNECTION, // There is no internet connection
    NO_INTERNET; // Wifi connected but no internet
}
