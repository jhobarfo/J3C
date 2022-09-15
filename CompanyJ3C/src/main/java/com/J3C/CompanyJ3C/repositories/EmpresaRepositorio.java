package com.J3C.CompanyJ3C.repositories;

import com.J3C.CompanyJ3C.Entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepositorio extends JpaRepository<Empresa,Long> {
}
