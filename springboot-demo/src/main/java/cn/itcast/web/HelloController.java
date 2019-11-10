package cn.itcast.web;

import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@Slf4j
@RestController
@RequestMapping("user")
public class HelloController {

//    @Autowired
//    private DataSource dataSource;

//    @GetMapping("/hello")
//    public String hello(){
//        log.debug("hello method is running");
//        return "hello, springboot!";
//    }

    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User hello(@PathVariable("id") Long id){
        return userService.queryById(id);
    }
}
