package com.rodrigo.helpdesk.services.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StandarError implements Serializable {

    private static final long serialVersionUID =1L;

    private  Long timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

}