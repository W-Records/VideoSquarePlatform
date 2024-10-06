package com.xuecheng.xuechengpluscontentapi.api;

import com.xuecheng.xuechengplusbase.model.PageParams;
import com.xuecheng.xuechengplusbase.model.PageResult;
import com.xuecheng.xuechengpluscontentmodel.model.dto.QueryCourseParamsDto;
import com.xuecheng.xuechengpluscontentmodel.model.po.CourseBase;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CourseBaseInfoController {

    @RequestMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto){

        return new PageResult<>(new ArrayList<>(),10L,996L,10L);
    }

}
