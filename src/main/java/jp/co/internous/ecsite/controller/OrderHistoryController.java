package jp.co.internous.ecsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
* 注文履歴機能を制御するコントローラークラス
* 注文履歴の登録、注文完了画面の表示を行う
*/
@Controller
public class OrderHistoryController {

	// orderHistoryDao という変数名で OrderHistoryDao インターフェースを利用するための宣言



	// 注文履歴テーブルに注文情報を登録し注文完了画面を表示する
	//【Ｑ１】URL「http://localhost:8080/ecsite/order」とひもづけする
	@GetMapping("Q1")
	//【Ｑ２】【Ｑ３】パラメータとして送られてきた値 productId を引数「int productId」に、
	// orderCount を引数「int orderCount」に格納する	
	public ModelAndView registerOrder(@RequestParam("Q2")int productId,
								 	  @RequestParam("Q3")int orderCount,
								 	  ModelAndView mav) {
		//【Ｑ４】注文履歴テーブルに注文情報を登録する

		//【Ｑ５】レスポンスとして次に表示させるHTMLファイル名を指定する

		return mav;
	}

}
