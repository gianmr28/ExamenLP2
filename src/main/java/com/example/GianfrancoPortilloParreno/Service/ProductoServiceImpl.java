package com.example.GianfrancoPortilloParreno.Service;

import com.example.GianfrancoPortilloParreno.DAO.ProductoDAO;
import com.example.GianfrancoPortilloParreno.Entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements iProductoService {

    private ProductoDAO productoDAO;

    @Autowired
    public ProductoServiceImpl (ProductoDAO productoDAO_) {
        productoDAO = productoDAO_;
    }

    @Override
    public List<Producto> findAllProductos() {
        return productoDAO.findAll();
    }

    @Override
    public Producto findProductoById(int id) {
        return productoDAO.findById(id).orElse(null);
    }

    @Override
    public Producto insertProducto(Producto producto) {
        Producto productotemp = productoDAO.save(producto);
        return productotemp;
    }

    @Override
    public Producto updateProducto(Producto producto) {
        Producto productotemp = productoDAO.save(producto);
        return productotemp;
    }

    @Override
    public void deleteProducto(int id) {
        productoDAO.deleteById(id);
    }
}
