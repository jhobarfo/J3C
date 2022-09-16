package com.J3C.CompanyJ3C.repositories;

import com.J3C.CompanyJ3C.Entidades.Empresa;
import com.J3C.CompanyJ3C.Entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoDineroRepositorio extends JpaRepository<MovimientoDinero,Long> {
    public MovimientoDinero findByempresaMId(Long id);
}
