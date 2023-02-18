package com.syedbaqirali.user.service;

import com.syedbaqirali.user.entity.User;
import com.syedbaqirali.user.repository.UserRepository;
import com.syedbaqirali.user.vo.Department;
import com.syedbaqirali.user.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private RestTemplate restTemplate;
    public User saveUser(User user) {
        log.info("UserService: Saving User: " + user.toString());

        return userRepository.save(user);
    }

    public User findByUserId(Long userId) {
        log.info("UserService: Finding User: " + userId);

        return userRepository.findByUserId(userId);
    }

    public List<User> findAll(){
        log.info("UserService: Finding All Users: ");
        return userRepository.findAll();
    }

    public ResponseTemplateVO findUserWithDepartment(Long userId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);

        Department department = new Department();
//                restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);

        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
