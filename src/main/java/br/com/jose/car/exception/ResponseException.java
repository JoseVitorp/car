package br.com.jose.car.exception;

import java.io.Serializable;
import java.util.Date;

public class ResponseException implements Serializable {

    private static final long SerialVersionUID = 1L;
    private Date timeStamp;
    private String message;
    private String details;

    public ResponseException() {
    }

    public ResponseException(Date timeStamp, String message, String details) {
        this.timeStamp = timeStamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
