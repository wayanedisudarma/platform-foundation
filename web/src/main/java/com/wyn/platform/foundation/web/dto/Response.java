package com.wyn.platform.foundation.web.dto;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response<T> {

  private int status;

  private String message;

  private T data;

  private ErrorDetails errorDetails;

  private Metadata metadata;

  public static <T> Response<T> ok(T data) {
    return Response.<T>builder()
        .status(HttpStatus.OK.value())
        .message(HttpStatus.OK.name())
        .data(data)
        .metadata(Metadata.builder().build())
        .build();
  }

  public static <T> Response<T> internalServerError(String message, ErrorDetails errorDetails) {
    return Response.<T>builder()
        .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
        .message(message)
        .errorDetails(errorDetails)
        .metadata(Metadata.builder().build())
        .build();
  }

  public static <T> Response<T> badRequest(String message) {
    return Response.<T>builder()
        .status(HttpStatus.BAD_REQUEST.value())
        .message(message)
        .metadata(Metadata.builder().build())
        .build();
  }

  public static <T> Response<T> badRequest(String message, ErrorDetails errorDetails) {
    return Response.<T>builder()
        .status(HttpStatus.BAD_REQUEST.value())
        .message(message)
        .errorDetails(errorDetails)
        .metadata(Metadata.builder().build())
        .build();
  }

  public static <T> Response<T> notFound(String message) {
    return Response.<T>builder()
        .status(HttpStatus.NOT_FOUND.value())
        .message(message)
        .metadata(Metadata.builder().build())
        .build();
  }

  public static <T> Response<T> notFound(String message, ErrorDetails errorDetails) {
    return Response.<T>builder()
        .status(HttpStatus.NOT_FOUND.value())
        .message(message)
        .errorDetails(errorDetails)
        .metadata(Metadata.builder().build())
        .build();
  }
}
