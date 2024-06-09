package com.example.GianfrancoPortilloParreno.Controller;

import com.example.GianfrancoPortilloParreno.Entity.Producto;
import com.example.GianfrancoPortilloParreno.Service.ProductoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductoController {
    private final ProductoServiceImpl productoService;

    @GetMapping("/productos")
    public List<Producto> getAllProductos() {
        return productoService.findAllProductos();
    }
    @GetMapping("/producto/{id}")
    public Producto getProductoById(@PathVariable int id) {
        return productoService.findProductoById(id);
    }
    @PostMapping("/producto")
    public Producto addProducto(@RequestBody Producto producto) {
        Producto productotemp = productoService.insertProducto(producto);
        return productotemp;
    }
    @PutMapping("/producto")
    public Producto updateProducto(@RequestBody Producto producto) {
        Producto productotemp = productoService.updateProducto(producto);
        return productotemp;
    }
    @DeleteMapping("/producto/{id}")
    public void deleteProducto(@PathVariable int id) {
        productoService.deleteProducto(id);
    }
}
