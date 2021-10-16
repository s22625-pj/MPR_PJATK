package pjatk.komputer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/computer")
public class ComputerRestController {

    @GetMapping("/example")
    public ResponseEntity<Computer> getExampleComputer(){
        Component motherboard = new Component(1,"intel","i5",1100d,300,ComponentType.CPU);
        List<Component> component2 = List.of(motherboard,cpu);

        Computer msi = new Computer(1,"Predator",2.5d,component2);
        return ResponseEntity.ok(msi);
    }
}
