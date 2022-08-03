package com.michal.excel_data_uploader.repositorys;

import com.michal.excel_data_uploader.entitys.Paleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PalRepo extends JpaRepository<Paleta,String> {


}
