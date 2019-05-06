package at.nacs.continuousintergration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HalloWorld {

  @GetMapping
  String get() {
    return "HALLO WORLD";
  }
}