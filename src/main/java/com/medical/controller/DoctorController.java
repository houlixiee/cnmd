package com.medical.controller;


import com.medical.entity.Doctor;
import com.medical.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 医生信息 前端控制器
 * </p>
 *
 * @author JiaJieTang
 * @since 2022-08-11
 */
@RestController
@RequestMapping("/medical/doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    //查询医生
    @RequestMapping("selDoctor")
    public Map<String,Object> selDo(int did){
        List<Doctor> dh = doctorService.likeDoAndDH(did);
        HashMap<String, Object> map = new HashMap<>();
        if (dh.size()>0){
            map.put("code",200);
            map.put("msg","查询成功");
            map.put("data",dh);
            return map;
        }else {
            map.put("code",200);
            map.put("msg","该科室没有医生");
            return map;
        }

    }

}
