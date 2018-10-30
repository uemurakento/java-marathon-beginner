package jp.co.rakus.service;

import org.springframework.stereotype.Component;

/**
 * 乗算を行うサービス
 * @author kento.uemura
 *
 */
@Component
public class CalcNumber {
	/**
	 * 乗算を行うメソッド
	 * @param num1 乗算する数値１
	 * @param num2 乗算する数値2
	 * @return 乗算結果
	 */
	public int multi(int num1,int num2) {
		return num1*num2;
	}
}
