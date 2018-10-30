package jp.co.rakus.service;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * 合計と税込金額を計算するサービス.
 * 
 * @author kento.uemura
 *
 */
@Component
public class RegisterTaxService {
	public static final double TAX_RATE = 0.08;

	/**
	 * 合計を計算するメソッド.
	 * 
	 * @param list
	 *            合計を計算するInteger型のデータのListを受け取る
	 * @return int型の合計値を返す
	 */
	public int sum(List<Integer> list) {
		int sum = 0;
		for (int num : list) {
			sum += num;
		}
		return sum;
	}

	/**
	 * 合計金額の税込金額を計算するメソッド.
	 * 
	 * @param list
	 *            合計金額の税込を計算するInteger型のデータのListを受け取る
	 * @return int型の税込金額を計算する
	 */
	public int tax(List<Integer> list) {
		return (int) ((TAX_RATE + 1) * sum(list));
	}
}
