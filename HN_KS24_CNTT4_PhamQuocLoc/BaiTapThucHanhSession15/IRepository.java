package HN_KS24_CNTT4_PhamQuocLoc.BaiTapThucHanhSession15;

import java.util.List;

public interface IRepository<T> {
    boolean add(T item);
    boolean removeById(String id);
    T findById(String id);
    List<T> findAll();
}
