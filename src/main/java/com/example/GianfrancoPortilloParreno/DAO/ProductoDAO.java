package com.example.GianfrancoPortilloParreno.DAO;

import com.example.GianfrancoPortilloParreno.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDAO extends JpaRepository<Producto, Integer> {
}
