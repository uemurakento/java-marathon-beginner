package jp.co.rakus.domain;

import org.springframework.stereotype.Component;

@Component
public class CalcNumber {
	public int multi(int num1,int num2) {
		return num1*num2;
	}
}
