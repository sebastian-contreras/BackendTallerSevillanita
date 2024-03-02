package com.SebastianContreras.SoftTaller.controllers;

import com.SebastianContreras.SoftTaller.DTO.PedidoDTO;
import com.SebastianContreras.SoftTaller.entities.Pedido;
import com.SebastianContreras.SoftTaller.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pedidos")
public class PedidosController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/all")
    public ResponseEntity<?> findAll() {
        List<Pedido> pedidoDtoList = pedidoService.findAll();
//                .map(pedido -> PedidoDTO.builder()
//                        .id(pedido.getId())
//                        .name(pedido.getName())
//                        .productList(pedido.getProductList())
//                        .build()).toList();
        return ResponseEntity.ok(pedidoDtoList);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id) {
        Optional<Pedido> pedidoOptional = pedidoService.findById(id);
        if (pedidoOptional.isPresent()) {
            Pedido pedido = pedidoOptional.get();
//            MakerDto pedidoDto = MakerDto.builder()
//                    .id(pedido.getId())
//                    .name(pedido.getName())
//                    .productList(pedido.getProductList())
//                    .build();
            return ResponseEntity.ok(pedido);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody PedidoDTO pedidoDto) throws URISyntaxException {
        pedidoService.save(Pedido.builder()
                .chofer(pedidoDto.getChofer())
                .fechaPedido(pedidoDto.getFechaPedido())
                .fechaLlegada(pedidoDto.getFechaLlegada())
                .kilometrajePedido(pedidoDto.getKilometrajePedido())
                .patente(pedidoDto.getPatente())
                .problemas(pedidoDto.getProblemas())
                .build());
        return ResponseEntity.created(new URI("/api/pedidos/save")).build();
    }


}
