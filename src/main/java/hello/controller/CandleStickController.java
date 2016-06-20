package hello.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLong;

import hello.CustomerRepository;
import hello.TickRepository;
import hello.model.Tick;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Контроллер для CRUD операций c данными свечного рафика
 * Created by fesswood on 18.06.16.
 */
@RestController
public class CandleStickController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private TickRepository repository;
    private static final Logger log = LoggerFactory.getLogger(CandleStickController.class);


    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public long insertTick(@RequestBody Tick tradeTick) {
        log.info("call insertTick with " + tradeTick);
        repository.save(tradeTick);
        return repository.count();
    }

    @RequestMapping(value = "/insertRandom", method = RequestMethod.GET)
    public long insertRandom() {
        Tick tick = new Tick(System.currentTimeMillis(), 0.255, 0.26, 0.256, 0.259, 50);
        log.info("call insertRandom with " + tick);
        repository.save(tick);
        return repository.count();
    }



    @RequestMapping(path = "/getAllTick")
    public List<Tick> getAllTicks() {
        log.info("call getAllTicks ");
        return repository.findAll();
    }

    @RequestMapping(path = "/clear", produces = {MediaType.APPLICATION_JSON_VALUE})
    public void deleteAll() {
        log.info("call insertClear");
        repository.deleteAll();
    }
}
