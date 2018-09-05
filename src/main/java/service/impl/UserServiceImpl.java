package service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import dao.UserMapper;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userDao;

    @Override
    public List<User> getAllUsers(){
        return userDao.selectByExample(null);
    }

    @Override
    public User getUserById(Long id) {
        return userDao.selectByPrimaryKey(id);
    }

    //@Transactional
    @Override
    public boolean add(User user) {
        if(user.getUsername() == null || "".equals(user.getUsername())){
            throw new RuntimeException("用户名不能为空");
        }
        //return userDao.insert(user) > 0;
        //测试事务是否生效
        return userDao.insert(user) > 0;
        //int i = 1 / 0;
        //return true;
    }

    @Override
    public boolean update(User user) {
        return userDao.updateByPrimaryKeySelective(user) > 0;
    }

    @Override
    public boolean delete(Long id) {
        return userDao.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public Long getTotalRowCount(String keywords) {
        return null;
    }

    @Override
    public Page<User> getUsersByPage(int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public Page<User> getUsersByPage(String keywords, int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public PageInfo<User> getUsersByPage2(int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public PageInfo<User> getUsersByPage2(String keywords, int pageIndex, int pageSize) {
        return null;
    }

}

