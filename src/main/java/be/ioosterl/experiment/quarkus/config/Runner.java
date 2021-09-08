package be.ioosterl.experiment.quarkus.config;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Runner {

  public static void main(String[] args) {
    Quarkus.run(ConfigService.class, args);
  }
}
