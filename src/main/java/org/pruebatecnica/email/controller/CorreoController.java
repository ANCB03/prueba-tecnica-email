package org.pruebatecnica.email.controller;

import lombok.RequiredArgsConstructor;
import org.pruebatecnica.email.dto.CorreoDto;
import org.pruebatecnica.email.service.EmailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/email")
@CrossOrigin
@RequiredArgsConstructor
public class CorreoController {

    private final EmailService emailService;
    private Map<String,Object> response = new HashMap<>();

    @PostMapping("/send")
    public ResponseEntity<?> sendEmail(@Valid @RequestBody CorreoDto correoDto) {
        response.clear();
        emailService.emailNotificacion(correoDto.getEmail(),correoDto.getPlaca(),correoDto.getMensaje(),correoDto.getParqueaderoNombre());
        response.put("mensaje","Correo Enviado");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
