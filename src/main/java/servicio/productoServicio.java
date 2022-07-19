package servicio;

import entidades.producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositorio.productoRepositorio;

import java.util.List;

@Service
public class productoServicio {

    @Autowired
    private static productoRepositorio productoRepositorio;

    public static List<producto> listAll(String palabraClave){
        if(palabraClave != null){
            return productoRepositorio.findAll(palabraClave);
        }
        return productoRepositorio.findAll();
    }

    public static void save(producto producto) {
        productoRepositorio.save(producto);
    }

    public static producto get(Long id) {
        return productoRepositorio.findById(id).get();
    }

    public static void delete(Long id) {
        productoRepositorio.deleteById(id);
    }
}
