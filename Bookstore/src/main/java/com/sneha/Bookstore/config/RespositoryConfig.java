package com.sneha.Bookstore.config;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.sneha.Bookstore.entity.Book;
@Configuration
public class RespositoryConfig implements RepositoryRestConfigurer {
	@Autowired
   private EntityManager entityManager;
	//expose Ids previously id were not displayed in json response
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	//	config.exposeIdsFor(Book.class); --for registering and exposing class one class
		config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream()// for all entity ids
				.map(Type::getJavaType)
				.toArray(Class[]::new));
	}
}
