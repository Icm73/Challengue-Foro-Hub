package com.aluracursos.Challengue.Foro.Hub.topico;

import java.time.LocalDateTime;

public record DatosListaTopico(
        Long id,
        String titulo,
        String mensaje,
        String curso,
        LocalDateTime fechaDeCreacion,
        String autor,
        Boolean status

) {
    public  DatosListaTopico(Topico topico){
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getCurso(),
                topico.getFechaDeCreacion(),
                topico.getAutor(),
                topico.isStatus()

        );
    }
}
