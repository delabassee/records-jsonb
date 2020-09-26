import javax.json.Json;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbNillable;
import javax.json.bind.annotation.JsonbProperty;

@JsonbNillable
public record Bug(int id, String message) {

    @JsonbCreator
    public Bug {}


    public String getMessage() {
        return message;
    }

    public int getId() {
        return id;
    }


/*
    public String toJson() {
        return Json.createObjectBuilder()
                .add("id", id)
                .add("message", message)
                .build().toString();
    }
*/

}


