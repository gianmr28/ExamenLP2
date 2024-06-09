package com.example.GianfrancoPortilloParreno.Service;


import com.example.GianfrancoPortilloParreno.Entity.Producto;

import java.util.List;

public interface iProductoService {

    public List<Producto> findAllProductos();
    public Producto findProductoById(int id);
    public Producto insertProducto(Producto producto);
    public Producto updateProducto(Producto producto);
    public void deleteProducto(int id);
}
