package io.github.smdawe;

import net.logstash.logback.marker.Markers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.UUID;

public class Main {

  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    MDC.put("Launch_ID", UUID.randomUUID().toString());

    LOG.info("Running");

    for (int i = 0; i < 10; i++) {
      LOG.info(Markers.append("Loop_Number", i), "Loop");
    }

    LOG.info("Finishing");

    MDC.remove("Launch_ID");

  }
}

