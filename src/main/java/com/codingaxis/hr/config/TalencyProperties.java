package com.codingaxis.hr.config;

import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "talency")
public interface TalencyProperties {
  Security security();

  public interface Security {
    Authentication authentication();

    public interface Authentication {
      Jwt jwt();

      public interface Jwt {

        public String issuer();

        public long tokenValidityInSeconds();

        public long tokenValidityInSecondsForRememberMe();

        PrivateKey privateKey();

        public interface PrivateKey {
          public String location();
        }
      }
    }
  }

  Mail mail();

  public interface Mail {
    public String baseUrl();
  }

  /*
   * @ConfigProperty(name = "issuer") public String issuer();
   *
   * @ConfigProperty(name = "token-validity-in-seconds") public long tokenValidityInSeconds();
   *
   * @ConfigProperty(name = "token-validity-in-seconds-for-remember-me") public long
   * tokenValidityInSecondsForRememberMe();
   *
   * @ConfigProperty(name = "private-key.location") public String location();
   *
   * @ConfigProperty(name = "mail.base-url") public String baseUrl();
   */

}
