package com.spmia.zuul.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class ServiceConfig {
  /**
   * 从 config server中加载该数据
   */
  @Value("${signing.key}")
  private String jwtSigningKey="";


  public String getJwtSigningKey() {
    return jwtSigningKey;
  }

}
