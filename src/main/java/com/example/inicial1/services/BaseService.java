package com.example.inicial1.services;

import java.util.List;

public interface BaseService<E>{
    public List<E> findAll() throws Exception; //Trae una lista de las personas que estan en la base de datos
    public E findById(Long id) throws Exception;
    public E save(E entity) throws Exception; // crea una nueva entidad
    public E update(Long id, E entity) throws Exception;
    public boolean delete(Long id) throws Exception;
}
