package com.medical.service.impl;

import com.medical.entity.Doctor;
import com.medical.mapper.DoctorMapper;
import com.medical.service.DoctorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 医生信息 服务实现类
 * </p>
 *
 * @author JiaJieTang
 * @since 2022-08-11
 */
@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor> implements DoctorService {

    @Autowired
    DoctorMapper doctorMapper;

    //根据科室id查询医生
    @Override
    public List<Doctor> likeDoAndDH(int did) {
        return doctorMapper.likeDoAndDH(did);
    }

    @Override
    public List<Doctor> getDoctorAndUser(String uState) {
        return doctorMapper.getDoctorAndUser(uState);
    }
}
