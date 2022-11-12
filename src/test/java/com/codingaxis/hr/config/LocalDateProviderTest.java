package com.codingaxis.hr.config;

import java.time.LocalDate;

import javax.ws.rs.ext.ParamConverter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LocalDateProviderTest {

  private LocalDateProvider localDateProvider = new LocalDateProvider();

  @Test
  void should_ReturnParamConverterAndConverterConverts() {

    final ParamConverter<LocalDate> converter = this.localDateProvider.getConverter(LocalDate.class, null, null);
    // assertThat(converter).isNotNull();
  }

  @Test
  void should_ConvertLocalDateToString() {

    final ParamConverter<LocalDate> converter = this.localDateProvider.getConverter(LocalDate.class, null, null);
    final LocalDate now = LocalDate.now();
    final String expected = LocalDateProvider.dateFormatter.format(now);
    Assertions.assertEquals(converter.toString(now), expected);
  }

  @Test
  void should_ConvertStringToLocalDate() {

    final ParamConverter<LocalDate> converter = this.localDateProvider.getConverter(LocalDate.class, null, null);
    final LocalDate date = LocalDate.now();
    final String dateString = LocalDateProvider.dateFormatter.format(date);
    Assertions.assertEquals(dateString, date);
  }
}
