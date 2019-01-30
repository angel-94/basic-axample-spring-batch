package com.mars.processing.batch.common;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.http.HttpStatus;

/**
 * @author Manuel Angel Ruiz Sumano - [Meltsan-Team]
 * @version 1.0.0
 * CommonResponse:
 * @since 2019-01-30
 */
public class CommonResponse {

    @ApiModelProperty(position = 1, notes = "Mensaje informativo del proceso de cargas.")
    private String message;


    @ApiModelProperty(position = 2, notes = "Descripción del causa de error.")
    private String cause;


    @ApiModelProperty(position = 3, notes = "Estatus de la petición.")
    private HttpStatus status;


    @ApiModelProperty(position = 4, notes = "")
    private boolean success;




    public CommonResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
