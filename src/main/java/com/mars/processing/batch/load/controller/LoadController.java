package com.mars.processing.batch.load.controller;

import com.mars.processing.batch.common.CommonResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Manuel Angel Ruiz Sumano - [Meltsan-Team]
 * @version 1.0.0
 * LoadController:
 * @since 2019-01-30
 */

@RestController
@RequestMapping("/v1/load/")
public class LoadController {


    private static final Logger LOGGER = LoggerFactory.getLogger(LoadController.class);

    @ApiOperation(value = "Carga de archivos.")
    @PostMapping
    public CommonResponse loadFile(
            @ApiParam(value = "Archivo a cargar.")
            @RequestParam(value = "file")MultipartFile file) {

        CommonResponse response = new CommonResponse();
        LOGGER.info("START LOAD FILE --> " + file.getOriginalFilename());

        response.setMessage("Archivo cargado de manera esxitosa.");
        response.setStatus(HttpStatus.OK);
        response.setSuccess(true);
        return response;
    }

}
