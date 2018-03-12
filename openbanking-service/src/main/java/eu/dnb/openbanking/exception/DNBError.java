package eu.dnb.openbanking.exception;

/**
 * Created by rmang on 11-03-2018.
 */
public enum DNBError {

    INTERNAL_SERVER_ERROR("5000", "Something went wrong!", "https://docs.example.com/help-for-error/"),
    REQUEST_DATA_ERROR("4000", "Error in request data", "https://docs.example.com/help-for-data-error/"),
    MISSING_RESOURCE("4001", "Missing Resource!", "https://docs.example.com/help-for-missing-resource/");

    private String errorCode;
    private String errorMessage;
    private String uriString;

    DNBError(String errorCode, String errorMessage, String uriString) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.uriString = uriString;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getUriString() {
        return uriString;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
