package com.demo;

public class CurrencyConverterImpl implements CurrencyConverter{
	
	private ExchangeService exchangeService;

	public ExchangeService getExchangeService() {
		return exchangeService;
	}

	public void setExchangeService(ExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}

	public double dollerToRupee(double doller) {
		
		return doller* exchangeService.getExchangeRate();
	}

}
