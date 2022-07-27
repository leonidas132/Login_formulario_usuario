package com.protalento.interfaces_jdbc;

import com.protalento.entidad.User_login;

public interface DAO<E,K>{
     User_login buscar(K k) ;
     boolean insertar(E e);
     boolean modifica(E e);
     boolean eliminar(E e);





}

