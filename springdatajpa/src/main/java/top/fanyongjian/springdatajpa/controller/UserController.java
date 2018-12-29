package top.fanyongjian.springdatajpa.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import top.fanyongjian.springdatajpa.pojo.User;
import top.fanyongjian.springdatajpa.repository.UserRepository;

import java.util.List;

@Api("用户信息管理")
@RestController
@RequestMapping("/user/*")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("index")
    public ModelAndView index(){
        List<User> userList = userRepository.findAll();
        return  new ModelAndView("user/user","userList",userList);
    }

    @GetMapping("user/{userId}")
    public ModelAndView userForm(@PathVariable String userId) {
        User user = userRepository.getOne("1");
        return new ModelAndView("user/userForm", "user", user);
    }

    @ApiOperation("获取列表")
    @GetMapping("list")
    public  List<User> list(){
        List<User> userList = userRepository.findAll();
        return  userList;
    }

    @ApiOperation("获取用户")
    @GetMapping("get")
    public User get() {
        userRepository.save(new User("2","sf","asfda","13435805850"));
        return userRepository.findById("1").get();
    }

    @ApiOperation("新增用户")
    @PostMapping("save")
    public boolean save(User user) {
         userRepository.save(user);
         return  userRepository.findByUsername(user.getUsername())!=null;
    }
}
