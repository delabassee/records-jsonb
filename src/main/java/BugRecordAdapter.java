import javax.json.Json;
import javax.json.JsonObject;
import javax.json.bind.adapter.JsonbAdapter;

public class BugRecordAdapter implements JsonbAdapter<Bug, JsonObject> {

    @Override
    public Bug adaptFromJson(JsonObject adapted) throws Exception {
        return new Bug(adapted.getInt("id"), adapted.getString("message"));
    }

    @Override
    public JsonObject adaptToJson(Bug b) throws Exception {
        return Json.createObjectBuilder()
                .add("id", b.id())
                .add("message", b.message())
                .build();
    }

}
