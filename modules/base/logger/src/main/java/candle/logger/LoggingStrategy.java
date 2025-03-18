package candle.logger;

import java.io.IOException;

public interface LoggingStrategy {
  void log( String format, long timestamp, Object... objs );

  void writeToFile( String message ) throws
                                     IOException;
}
