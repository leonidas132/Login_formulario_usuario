package com.protalento.interfaces_jdbc;

import com.protalento.entidad.User_login;

public interface DAO<E,K>{
     //Data Access Object
     /*Representada por una interfaz que contiene la abstracción de los
      *métodos necesarios para acceder, modificar, eliminar e insertar
      * nuestros objetos. Podemos sin ningún problema crear una interfaz por cada entidad de
      * negocio pero para simplificar nuestro código nos apoyamos en los genéricos.*/

     E buscar(K k) ;
     boolean insertar(E e);
     boolean modifica(E e);
     boolean eliminar(E e);





}

