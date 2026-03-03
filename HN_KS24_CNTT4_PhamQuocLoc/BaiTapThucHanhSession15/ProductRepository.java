package HN_KS24_CNTT4_PhamQuocLoc.BaiTapThucHanhSession15;

import java.util.*;

public class ProductRepository implements IRepository<Product> {
    private List<Product> products = new ArrayList<>();
    private Map<String, Product> productMap = new HashMap<>();

    @Override
    public boolean add(Product item) {
        if(item == null || productMap.containsKey(item.getId())){
            return false;
        }
        products.add(item);
        productMap.put(item.getId(),item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        if(id == null) {
            return false;
        }
        Product p  = productMap.remove(id);
        if(p != null){
            products.remove(p);
            return true;
        }
        return false;
    }

    @Override
    public Product findById(String id) {
        if (id == null) {
            return null;
        }
        return productMap.get(id);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }
}
