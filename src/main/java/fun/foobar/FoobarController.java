package fun.foobar;

import io.micronaut.http.annotation.*;

@Controller("/foobar")
public class FoobarController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}