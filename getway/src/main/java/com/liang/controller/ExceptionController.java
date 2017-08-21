package com.liang.controller;

import com.mrliang.common.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.AbstractErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/error")
public class ExceptionController extends AbstractErrorController {
    private final List<ErrorViewResolver> errorViewResolvers = null;
    @Autowired
    public ExceptionController(ErrorAttributes errorAttributes) {
        super( errorAttributes );
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity error(HttpServletRequest request) {
        HttpStatus status = getStatus( request );
        status = HttpStatus.OK;
        ResponseDto responseDto = new ResponseDto();
        responseDto.initError( null );
        Map<String, Object> body = getErrorAttributes(request,false);
        responseDto.setErrorDetail(body);
        return new ResponseEntity( responseDto, status );
    }
}
