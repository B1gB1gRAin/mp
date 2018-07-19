package com.bigbigrain.mp5.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.bigbigrain.mp5.beans.Employee;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author weiyunhui
 * @since 2018-06-21
 */
public interface EmployeeMapper extends BaseMapper<Employee> {
	
	int  deleteAll();
}
