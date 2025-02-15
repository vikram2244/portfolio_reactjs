package com.web.portfolio.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.portfolio.Repository.PortfolioRepository;
import com.web.portfolio.Service.PortfolioService;
import com.web.portfolio.model.Portfoliomodel;


@Service
public class PortfolioServiceImpl implements PortfolioService {

	@Autowired
	private PortfolioRepository PortfolioRepository;

	@Override
	public Portfoliomodel createEmployee(Portfoliomodel Portfoliomodel) {
	return PortfolioRepository.save(Portfoliomodel);
	}

}
