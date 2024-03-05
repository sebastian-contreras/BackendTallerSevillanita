package com.SebastianContreras.SoftTaller.controllers;

import com.SebastianContreras.SoftTaller.DTO.PedidoDTO;
import com.SebastianContreras.SoftTaller.entities.Conjunto;
import com.SebastianContreras.SoftTaller.entities.Pedido;
import com.SebastianContreras.SoftTaller.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/pedidos")
public class PedidosController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/all")
    public ResponseEntity<?> findAll() {
        List<Pedido> pedidoDtoList = pedidoService.findAll();
        return ResponseEntity.ok(pedidoDtoList);
    }

    @GetMapping("/")
    public ResponseEntity<?> findAll(Pageable pageable) {
        Map<String, Object> response = new HashMap<>();
        Page<Pedido> pedidoDtoList = pedidoService.findAllPage(pageable);
        response.put("Pedidos", pedidoDtoList.getContent());
        response.put("currentePage", pedidoDtoList.getNumber());
        response.put("totalPages", pedidoDtoList.getTotalPages());
        response.put("totalElements", pedidoDtoList.getTotalElements());
        return ResponseEntity.ok(response);
    }


    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id) {
        Optional<Pedido> pedidoOptional = pedidoService.findById(id);
        Pedido pedido = pedidoOptional.get();
        return ResponseEntity.ok(pedido);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody PedidoDTO pedidoDto) throws URISyntaxException {
        Pedido newPedido = Pedido.builder()
                .chofer(pedidoDto.getChofer())
                .fechaPedido(pedidoDto.getFechaPedido())
                .fechaLlegada(pedidoDto.getFechaLlegada())
                .kilometrajePedido(pedidoDto.getKilometrajePedido())
                .patente(pedidoDto.getPatente())
                .problemas(pedidoDto.getProblemas())
                .estado(true)
                .build();
        return ResponseEntity.created(new URI("/api/pedidos/save")).body(pedidoService.save(newPedido));
    }

    @PutMapping("/save/{id}")
    public ResponseEntity<?> save(@RequestBody PedidoDTO pedidoDto, @PathVariable Integer id) throws URISyntaxException {
        Optional<Pedido> pedidoOptional = pedidoService.findById(id);
        if (!pedidoOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        Pedido pedido = pedidoOptional.get();
        System.out.println(pedido);
        pedido.setChofer(pedidoDto.getChofer() != null ? pedidoDto.getChofer() : pedido.getChofer());
        pedido.setProblemas(pedidoDto.getProblemas() != null ? pedidoDto.getProblemas() : pedido.getProblemas());
        pedido.setEstado(pedidoDto.getEstado() != null ? pedidoDto.getEstado() : pedido.getEstado());
        return ResponseEntity.created(new URI("/api/pedidos/save")).body(pedidoService.save(pedido));
    }


}
