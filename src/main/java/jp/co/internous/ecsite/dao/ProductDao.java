package jp.co.internous.ecsite.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.ecsite.dto.ProductDto;

/*
 * 商品情報にアクセスするためのDAO
 */
@Mapper
public interface ProductDao {

	// 商品情報の全件検索
    @Select("""
    			-- 【Lesson02】ここにSQL文を記述

            """)
    public ArrayList<ProductDto> getAllProducts();

	 // 商品IDをもとにした1件の商品情報の検索
    @Select("""
    			-- 【Lesson04】ここにSQL文を記述

    	    """)
    public ProductDto getProductByProductId(int productId);

}
