package sv.com.gameteam.micronautcrud;

import io.micronaut.http.annotation.*;

@Controller("/micronaut-crud")
public class MicronautCrudController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}