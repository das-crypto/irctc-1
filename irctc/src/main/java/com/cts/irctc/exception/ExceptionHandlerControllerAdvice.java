package com.cts.irctc.exception; 
import javax.servlet.http.HttpServletRequest; 
 
 
import org.springframework.http.HttpStatus; 
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.ControllerAdvice; 
import org.springframework.web.bind.annotation.ExceptionHandler; 
import org.springframework.web.bind.annotation.ResponseStatus; 
import org.springframework.web.servlet.ModelAndView; 
@ControllerAdvice 
public class ExceptionHandlerControllerAdvice { 
 
@ExceptionHandler(ApplicationException.class) 
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR) 
public ModelAndView handleResourceNotFound(final ApplicationException exception, final HttpServletRequest request,final Model model) { 
 
//Add code here.. 
ModelAndView mv=new ModelAndView(); 
mv.setViewName("error"); 
mv.addObject("errorMessage","From and to city can't be same"); 
//add attribute error and timestamp 
mv.addObject("responseCode","400"); 
return mv; //TODO, modify return value 
} 
} 