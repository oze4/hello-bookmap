package hello.bookmap;

import velox.api.layer1.annotations.Layer1ApiVersion;
import velox.api.layer1.annotations.Layer1ApiVersionValue;
import velox.api.layer1.annotations.Layer1SimpleAttachable;
import velox.api.layer1.annotations.Layer1StrategyName;
import velox.api.layer1.common.Log;
import velox.api.layer1.data.InstrumentInfo;
import velox.api.layer1.simplified.Api;
import velox.api.layer1.simplified.CustomModule;
import velox.api.layer1.simplified.InitialState;

@Layer1SimpleAttachable
@Layer1StrategyName("Hello Bookmap API with logs")
@Layer1ApiVersion(Layer1ApiVersionValue.VERSION1)
public class HelloBookmapApiWithLogs implements CustomModule {

    @Override
    public void initialize(String alias, InstrumentInfo info, Api api, InitialState initialState) {
        Log.info("Hello");
    }

    @Override
    public void stop() {
        Log.info("Bye");
    }
}
