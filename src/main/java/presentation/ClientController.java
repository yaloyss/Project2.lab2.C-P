package presentation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import data.ClientRepository;

@Controller
public class ClientController {
    private final ClientRepository clientRepository;
    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    @GetMapping("/client")
    public String getClients(Model model) {
        model.addAttribute("client", clientRepository.findAll());
        return "client";
    }
}
