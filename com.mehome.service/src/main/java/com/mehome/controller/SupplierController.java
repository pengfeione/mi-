package com.mehome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mehome.requestDTO.SupplierBean;
import com.mehome.service.iface.ISupplierService;
import com.mehome.utils.Result;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
	private final static String cros="*";
	@Autowired
	private ISupplierService supplierSerive;
	@PostMapping("/list")
	@ResponseBody
	public ResponseEntity<Result> list(@RequestBody SupplierBean bean){
        return ResponseEntity
                .ok()
                .header("Access-Control-Allow-Origin", cros)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(Result.build("供应商列表请求/supplier/list").content(supplierSerive.getListByCondition(bean),supplierSerive.getSizeByCondition(bean)));
    }
	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<Result> add(@RequestBody SupplierBean bean){
        return ResponseEntity
                .ok()
                .header("Access-Control-Allow-Origin", cros)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(Result.build("供应商添加请求/supplier/add").content(supplierSerive.addSupplier(bean)));
    }
	@PostMapping("/update")
	@ResponseBody
	public ResponseEntity<Result> update(@RequestBody SupplierBean bean){
        return ResponseEntity
                .ok()
                .header("Access-Control-Allow-Origin", cros)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(Result.build("供应商修改请求/supplier/update").content(supplierSerive.updateSupplier(bean)));
    }


}