package org.mir.saleem;

import java.util.HashMap;

public class Processor {
    public LambdaResponse execute() {
        return new LambdaResponse(false, 200, "hello from SOM lambda", new HashMap<String, String>(), new HashMap<>());
    }
}
