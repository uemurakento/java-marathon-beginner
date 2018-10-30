package jp.co.rakus.service;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RegisterTax {
	public static final double TAX_RATE = 0.08;
	
	public int sum(List<Integer> list) {
		int sum = 0;
		for(int num:list) {
			sum+=num;
		}
		return sum;
	}
	
	public int tax(List<Integer> list) {
		return (int)((TAX_RATE+1)*sum(list));
	}
}
