package be.ioosterl.experiment.quarkus.config;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ConfigService {

  @ConfigProperty(name="config.value")
  String value;

  @ConfigProperty(name="config.replacedValue")
  String replacedValue;

  public String getValue() {
    return value;
  }

  public String getReplacedValue() {
    return replacedValue;
  }
}
