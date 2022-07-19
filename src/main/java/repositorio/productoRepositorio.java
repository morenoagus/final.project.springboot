package repositorio;

import entidades.producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface productoRepositorio extends JpaRepository<producto, Long> {

    @Query("SELECT p FROM producto p WHERE p.nombre LIKE %?1%"
            + " CONCAT( p.id, p.nombre, p.marca, p.hechoEn, p.precio)"
            + " LIKE %?1%")
    public List<producto> findAll(String palabraClave);
}
