package tech.silva.scheduler.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class AgendamentoService {

    // Delay fixo a base de milisegundos, ou seja, 1000 = 1 segundo
    @Scheduled(fixedDelay = 1000)
    public void AgendaTarefas(){
        log.info("Agendado e executado em {}", LocalDateTime.now());
    }

}
