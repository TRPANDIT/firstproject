package com.demo;

public class ExchangeServiceImpl implements ExchangeService {

	private double exchangeRate;
	
	public ExchangeServiceImpl() {}
	
	public ExchangeServiceImpl(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
	public double getExchangeRate() {
		return exchangeRate;
	}

}
