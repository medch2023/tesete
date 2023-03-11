package ma.geo.local.conrollers;
import ma.geo.local.dtos.StudentDtos;
import ma.geo.local.repositories.StudentRepositoryIml;
import ma.geo.local.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.hibernate.tool.schema.SchemaToolingLogging.LOGGER;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final static Logger LOG =  LoggerFactory.getLogger(StudentController.class);

    private StudentService service;
    StudentController(StudentService service){
        this.service = service;
    }

    @PostMapping ("/save")
    public StudentDtos save(@RequestBody StudentDtos dtos){
        LOGGER.debug("start save dto:{}");
        long id = service.create(dtos);
        LOG.debug("end method create");
        return dtos;
    }

    @PutMapping
    public boolean update(@RequestBody StudentDtos dtos){
        LOGGER.debug("start method update");
        boolean id = service.update(dtos);
        LOG.debug("end method update");
        return service.update(dtos);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") long id){
        LOGGER.debug("start method delete");
        LOGGER.debug("end method delete");
        return service.delete(id);
    }

    @GetMapping
    public List<StudentDtos> readAll(){
        LOG.debug("start method update");
        LOG.debug("end method update");
        return service.readAll();
    }


}
