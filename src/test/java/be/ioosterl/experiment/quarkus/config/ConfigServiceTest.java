package be.ioosterl.experiment.quarkus.config;

import io.quarkus.test.junit.QuarkusTest;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

@QuarkusTest
public class ConfigServiceTest {

  @ConfigProperty(name = "config.direct")
  String directConfig;

  @Inject
  ConfigService service;

  @Test
  void injectService() {
    assertThat(service).isNotNull();
  }

  @Test
  void injectConfigInTest() {
    assertThat(directConfig).isNotNull();
  }
}
