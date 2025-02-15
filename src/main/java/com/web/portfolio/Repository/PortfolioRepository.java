package com.web.portfolio.Repository;

import org.springframework.data.repository.CrudRepository;

import com.web.portfolio.model.Portfoliomodel;

public interface PortfolioRepository  extends CrudRepository<Portfoliomodel,Long>{

}
