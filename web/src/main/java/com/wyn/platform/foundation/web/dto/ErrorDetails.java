package com.wyn.platform.foundation.web.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDetails {

  private String title;

  private String description;

  private String errorCode;
}
