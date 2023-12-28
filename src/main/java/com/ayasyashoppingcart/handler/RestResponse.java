package com.ayasyashoppingcart.handler;

public record RestResponse(boolean success, String message, Integer errorCode, String details) {

}
