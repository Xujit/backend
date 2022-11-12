package com.codingaxis.hr.config;

import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "talency.info.swagger")
public interface TalencyInfo {

  Boolean isEnable();

}
