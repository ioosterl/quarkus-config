package be.ioosterl.experiment.quarkus.config;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ConfigService {

  @ConfigProperty(name="config.value")
  String value;

  public String getValue() {
    return value;
  }
}
