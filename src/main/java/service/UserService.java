package service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    boolean add(User user);

    boolean update(User user);

    boolean delete(Long id);

    Long getTotalRowCount(String keywords);

    Page<User> getUsersByPage(int pageIndex, int pageSize);

    Page<User> getUsersByPage(String keywords, int pageIndex, int pageSize);

    PageInfo<User> getUsersByPage2(int pageIndex, int pageSize);

    PageInfo<User> getUsersByPage2(String keywords, int pageIndex, int pageSize);
}

