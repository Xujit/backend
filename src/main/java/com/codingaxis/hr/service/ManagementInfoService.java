package com.codingaxis.hr.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.codingaxis.hr.config.TalencyInfo;
import com.codingaxis.hr.service.dto.ManagementInfoDTO;

import io.quarkus.runtime.configuration.ProfileManager;

/**
 * Provides information for management/info resource
 */
@ApplicationScoped
public class ManagementInfoService {

  private final TalencyInfo talencyInfo;

  @Inject
  public ManagementInfoService(TalencyInfo JHipsterInfo) {

    this.talencyInfo = JHipsterInfo;
  }

  public ManagementInfoDTO getManagementInfo() {

    var info = new ManagementInfoDTO();
    if (this.talencyInfo.isEnable()) {
      info.activeProfiles.add("swagger");
    }
    info.activeProfiles.add(ProfileManager.getActiveProfile());
    info.displayRibbonOnProfiles = ProfileManager.getActiveProfile();
    return info;
  }
}
