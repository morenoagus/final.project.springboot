package controlador;

import entidades.producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.support.ModelAndViewContainer;
import servicio.productoServicio;

import java.util.List;

@Controller
public class productoControlador {

    @Autowired
    private productoServicio ProductoServicio;

    public String verPaginaDeInicio(Model modelo, @Param("palabraClave") String palabraClave) {
        List<producto> listaProductos = productoServicio.listAll(palabraClave);

        modelo.addAttribute("listaProductos", listaProductos);
        modelo.addAttribute("palabraClave", palabraClave);
        return "index";
    }

    @RequestMapping("/nuevo")
    public String mostrarFormularioDeRegistrarProducto(Model modelo) {
        producto producto = new producto();
        modelo.addAttribute("producto", producto);
        return "nuevo_producto";
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardarProducto(@ModelAttribute("producto")producto producto) {
        productoServicio.save(producto);
        return "redirect:/";
    }

    @RequestMapping(value = "/editar/{id}")
    public ModelAndView mostrarFormularioDeEditarProducto(@PathVariable(name = "id") Long id) {
        ModelAndView modelo =  new ModelAndView("editar_producto");

        producto producto = productoServicio.get(id);
        modelo.addObject("producto", producto);

        return modelo;
    }

    @RequestMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable(name = "id") Long id) {
        productoServicio.delete(id);
        return "redirect:/";
    }



}
