package be.ioosterl.experiment.quarkus.config;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@QuarkusMain
public class ConfigService implements QuarkusApplication {

  @ConfigProperty(name = "config.value")
  String value;

  @ConfigProperty(name = "config.replacedValue")
  String replacedValue;

  public String getValue() {
    return value;
  }

  public String getReplacedValue() {
    return replacedValue;
  }

  @Override
  public int run(String... args) throws Exception {
    System.out.println("config.value=" + getValue());
    System.out.println("config.replacedValue=" + getReplacedValue());
    return 0;
  }
}
