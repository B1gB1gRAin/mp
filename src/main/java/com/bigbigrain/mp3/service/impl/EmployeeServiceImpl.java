package com.bigbigrain.mp3.service.impl;

import com.bigbigrain.mp3.beans.Employee;
import com.bigbigrain.mp3.mapper.EmployeeMapper;
import com.bigbigrain.mp3.service.EmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bigbigrain
 * @since 2018-07-17
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
