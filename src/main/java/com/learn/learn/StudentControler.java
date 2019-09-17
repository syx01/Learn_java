package com.learn.learn;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentControler {
    @Autowired
    private StudentService studentService;

    @RequestMapping("")
    public List findList() {
       return studentService.findAll();
    }

    @RequestMapping("/download")
    public void downLoad(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response){
        List<Map<String, Object>> list= new ArrayList<>();
        Map<String, Object> map1 = new HashMap<>();
        map1.put("1","2");
        list.add(map1);
        Workbook workbook = ExcelExportUtil.exportExcel(list, ExcelType.HSSF);
        try {
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
