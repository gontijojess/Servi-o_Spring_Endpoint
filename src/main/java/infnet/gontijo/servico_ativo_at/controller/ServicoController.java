package infnet.gontijo.servico_ativo_at.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class ServicoController {
    @GetMapping
    public String getStatus() {
        return "Serviço Ativo!";
    }
}
