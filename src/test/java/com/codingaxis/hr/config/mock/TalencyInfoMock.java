package com.codingaxis.hr.config.mock;

import com.codingaxis.hr.config.TalencyInfo;
import io.quarkus.test.Mock;

import javax.enterprise.context.ApplicationScoped;

@Mock
@ApplicationScoped
public class TalencyInfoMock implements TalencyInfo {

    public static Boolean enable;

    @Override
    public Boolean isEnable() {
        return enable;
    }
}
