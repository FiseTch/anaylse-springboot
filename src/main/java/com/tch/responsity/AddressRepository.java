package com.tch.responsity;

import com.tch.domain.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Tongch
 * @version 1.0
 * @time 2018/8/16 10:13
 */
public interface AddressRepository extends JpaRepository<UserAddress,Integer> {
}
