package com.wyn.platform.foundation.web.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Metadata {

  private LocalDateTime timestamp;

  private String traceId;
}
