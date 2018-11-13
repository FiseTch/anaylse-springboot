package com.tch.responsity;

import com.tch.domain.security.UserImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/9/6 17:24
 */
public interface UserRepository extends JpaRepository<UserImpl, String> {
    
    //nativeQuery:属性的设置，是表明该方法中的sql以数据库的sql语句格式对待。
    
    /**
     * 查询所有的id
     *
     * @return
     */
    @Query(value = "select id from sys_user", nativeQuery = true)
    List<String> getAllUserId();
    
    /**
     * 通过用户名查询用户
     * @param username
     * @return
     */
    @Query(value = "select u from sys_user u where u.username = ?1", nativeQuery = true)
    UserImpl getUserByUsername(String username);
    
    
}
