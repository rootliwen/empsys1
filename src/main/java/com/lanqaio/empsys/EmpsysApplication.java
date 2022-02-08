package com.lanqaio.empsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


@SpringBootApplication
@MapperScan(basePackages = {"com.lanqaio.empsys.dao"})
public class EmpsysApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpsysApplication.class, args);
	}

}
