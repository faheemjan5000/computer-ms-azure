package faheem.microservices.computer.ms.controller;

import faheem.microservices.computer.ms.model.Computer;
import faheem.microservices.computer.ms.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/computer")
public class ComputerController {

    @Autowired
    private ComputerService computerService;

    @PostMapping("/add")
    public Computer saveComputer(@RequestBody Computer computer){
        return computerService.addComputer(computer);
    }

    @GetMapping("/find/{id}")
    public Computer getComputer(@PathVariable("id") Integer id){
        return computerService.getComputer(id);
    }

    @GetMapping("/computers")
    public List<Computer> getComputer(){
        return computerService.getAllComputers();
    }
}
