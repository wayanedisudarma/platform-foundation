package com.wyn.platform.foundation.web.dto;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

import org.slf4j.MDC;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Metadata {

  @Builder.Default private LocalDateTime timestamp = LocalDateTime.now();

  @Builder.Default
  private String traceId =
      Optional.ofNullable(MDC.get("traceId")).orElse(UUID.randomUUID().toString());
}
