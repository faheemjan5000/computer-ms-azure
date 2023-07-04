package faheem.microservices.computer.ms.service;

import faheem.microservices.computer.ms.model.Computer;
import faheem.microservices.computer.ms.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ComputerService {

    @Autowired
    private ComputerRepository computerRepository;

    public Computer addComputer(Computer computer){
        System.out.printf("ComputerService.addComputer method is called...");
        return computerRepository.save(computer);
    }

    public Computer getComputer(Integer id){
        Optional<Computer> optionalComputer = computerRepository.findById(id);
        if(optionalComputer.isPresent()){
            return optionalComputer.get();
        }
        else{
            throw new NoSuchElementException("computer not found with this id");
        }
    }

    public List<Computer> getAllComputers(){
        return computerRepository.findAll();
    }
}
