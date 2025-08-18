package jp.co.internous.ecsite.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * 注文履歴情報にアクセスするためのDAO
 */
@Mapper
public interface OrderHistoryDao {

	// 注文情報を登録する
	@Insert("""
    			insert into order_history (product_id, order_count, order_at)
    			values (#{productId}, #{orderCount}, NOW());
            """)
	public void insertOrderHistory(int productId, int orderCount);

}
