package com.SebastianContreras.SoftTaller.DTO;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDate;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PedidoDTO {
    private Integer idPedido;
    private String patente;
    private String chofer;
    private Integer kilometrajePedido;
    private String problemas;
    private LocalDate fechaPedido;
    private LocalDate fechaLlegada;
    private Boolean estado;
}
