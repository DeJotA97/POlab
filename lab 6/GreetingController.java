
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController
{
    private static final String template = "Podaj dane: wiek %s, id %s, imie %s, plec %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/bye")
    public Greeting greeting(@RequestParam(value = "wiek", defaultValue = "23") String
                                         wiek,
                                   @RequestParam(value = "id", defaultValue = "1337") String id,
                                   @RequestParam(value = "imie", defaultValue = "Konrad") String imie, String plec)
    {
        if(imie.endsWith("a"))
        {
            plec = "kobieta";
        }
        else
        {
            plec = "mezczyzna";
        }
        return new Greeting(counter.incrementAndGet(), String.format(template, wiek, id, imie, plec));
    }
    private final AtomicLong counternowy = new AtomicLong();
    @RequestMapping("/byenowy")
    public String greetingnowy(@RequestParam(value = "sprawdzam_wzor", defaultValue = "Konrad") String
                                         imie, String wzor)
    {
        if(imie == "Konrad")
        {
            wzor = "jest we wzorze";
        }
        else
        {
            wzor = "nie ma we wzorze";
        }
        return "Podane imie " +wzor;
    }

}