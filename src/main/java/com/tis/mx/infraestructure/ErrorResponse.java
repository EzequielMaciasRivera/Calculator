package com.tis.mx.infraestructure;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ErrorResponse {
  /** The code. */
  private Integer code;
  
  /** The message. */
  private String message;
  
  /** The location. */
  private String location;
  
  /** The more info. */
  private String moreInfo;
}
