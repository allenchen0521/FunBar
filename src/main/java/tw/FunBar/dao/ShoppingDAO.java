package tw.FunBar.dao;

import java.util.ArrayList;
import java.util.List;

import tw.FunBar.model.ProductBean;

public interface ShoppingDAO {

	List<ProductBean> showNewProducts(); // 首頁最新商品

	List<ProductBean> getProductByPage(int index); // Mall分頁

	int getIndex(); // Mall取得分頁數

	List<ProductBean> getAllproducts1(int Index); // 後台管理顯示所有商品分頁

	int getProdIndex1(); // 後台管理商品取得分頁數

	List<String> getAllCategories();

	List<ProductBean> getProductByCategory(String category, Integer index); // Category分頁

	int getCategoryIndex(String category); // Category取得分頁數

	List<ProductBean> getAllProducts(); // 顯示所有商品

	ArrayList<ProductBean> getProdById(Integer productId);

	List<ProductBean> getProdByName(String productName, Integer index);

	List<ProductBean> getProdByName2(String productName, Integer index);

	int getPBNIndex(String productName);

	int getPBNIndex2(String productName);

}
