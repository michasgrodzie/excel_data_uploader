package com.michal.excel_data_uploader;

import com.michal.excel_data_uploader.entitys.Paleta;
import com.michal.excel_data_uploader.repositorys.PalRepo;
import com.michal.excel_data_uploader.service.PalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.michal.excel_data_uploader.service","com.michal.excel.excel_data_uploader.repositorys"})
public class ExcelDataUploaderApplication {



	public static void main(String[] args) {
		SpringApplication.run(ExcelDataUploaderApplication.class, args);

	}














}
