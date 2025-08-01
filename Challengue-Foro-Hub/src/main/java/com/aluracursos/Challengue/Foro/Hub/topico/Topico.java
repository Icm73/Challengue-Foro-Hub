package com.aluracursos.Challengue.Foro.Hub.topico;



import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "Topico")
@Table(name = "topicos")
@EqualsAndHashCode(of = "id")

public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String curso;
    private LocalDateTime fechaDeCreacion;
    private String autor ;
    private boolean status;
    private boolean activo;


public Topico(DatosRegistroTopico datos){
    this.id= null;
    this.titulo = datos.titulo();
    this.mensaje = datos.mensaje();
    this.curso = datos.curso();
    this.autor = datos.autor();
    this.fechaDeCreacion = LocalDateTime.now();
    this.activo = true;
    this.status = true;


    }
    public void actualizar(DatosActualizarTopico datos){
        if(datos.titulo() != null){
            this.titulo = datos.titulo();
        }
        if(datos.mensaje() != null){
            this.mensaje= datos.mensaje();
        }
        if(datos.curso() != null){
            this.curso= datos.curso();
        }

    }

    public void eliminar(){this.status = false;}



    }









