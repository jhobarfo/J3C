package com.J3C.CompanyJ3C.repositories;

import com.J3C.CompanyJ3C.Entidades.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepositorio extends JpaRepository<Perfil,Long> {
}
