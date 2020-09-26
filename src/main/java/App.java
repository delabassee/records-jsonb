import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class App {

    public static void main(String[] args) {

        var originalBug = new Bug(666, "big crash");
        var jsonDoc = """
                      {"id":666,"message":"big crash"}
                      """;


        System.out.println("\nSerialization using getters - Record to JSON ");
        Jsonb jsonb = JsonbBuilder.create();
        System.out.println("--> " +jsonb.toJson(originalBug));

        System.out.println("\nSerialization using JSONB adapter - Record to JSON");
        Jsonb jsonbBis = JsonbBuilder.create(new JsonbConfig().withAdapters(new BugRecordAdapter()));
        System.out.println("--> "+ jsonbBis.toJson(originalBug));

        System.out.println("\nDeserialization - JSON to Record");

        Bug someBug = jsonb.fromJson(jsonDoc, Bug.class);
        if (someBug.equals(originalBug)) {
            System.out.println("OK! "+ someBug);
        }

        System.out.println("\nDeserialization using JSONB adapter - JSON to Record");
        someBug = jsonbBis.fromJson(jsonDoc, Bug.class);

        if (someBug.equals(originalBug)) {
            System.out.println("OK! "+ someBug);
        }

    }


}


