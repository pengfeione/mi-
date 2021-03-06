package com.mehome.controller;

import com.mehome.domain.CompanyList;
import com.mehome.requestDTO.PlatformCompanyListDTO;
import com.mehome.requestDTO.UserInfoDTO;
import com.mehome.service.iface.IPlatformService;
import com.mehome.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by renhui on 2017/5/8.
 * 平台后台接口
 */
@RestController
@RequestMapping("/platform")
public class PlatformBackController {
    @Value("${cros}")
    private String cros;
    @Autowired
    private IPlatformService platformService;

    /**
     * 平台用户列表
     *
     * @param code
     * @return
     */
    @GetMapping("/users")
    @ResponseBody
    public ResponseEntity<Result> users(@PathVariable String code) {
        return ResponseEntity
                .ok()
                .header("Access-Control-Allow-Origin", cros)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(Result.build().content(new Object()));
    }

    /**
     * 平台企业列表
     *
     * @param requestDTO
     * @return
     */
    @GetMapping("/company/list")
    @ResponseBody
    public ResponseEntity<Result> company_list(@RequestBody PlatformCompanyListDTO requestDTO) {
        return ResponseEntity
                .ok()
                .header("Access-Control-Allow-Origin", cros)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(Result.build().content(new Object()));
    }

    /**
     * 平台企业列表
     *
     * @param companyList
     * @return
     */
    @GetMapping("/company/edit")
    @ResponseBody
    public ResponseEntity<Result> company_edit(@RequestBody CompanyList companyList) {
        return ResponseEntity
                .ok()
                .header("Access-Control-Allow-Origin", cros)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(Result.build().content(new Object()));
    }

    /**
     * 平台企业列表
     *
     * @param companyList
     * @return
     */
    @GetMapping("/company/add")
    @ResponseBody
    public ResponseEntity<Result> company_add(@RequestBody CompanyList companyList) {
        return ResponseEntity
                .ok()
                .header("Access-Control-Allow-Origin", cros)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(Result.build().content(new Object()));
    }

    /**
     * 平台企业列表
     *
     * @param userInfoDTO
     * @return
     */
    @PostMapping("/users/list")
    @ResponseBody
    public ResponseEntity<Result> users_list(@RequestBody UserInfoDTO userInfoDTO) {
        return ResponseEntity
                .ok()
                .header("Access-Control-Allow-Origin", cros)
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(Result.build().content(platformService.listByCondition(userInfoDTO), platformService.countByCondition(userInfoDTO)));
    }
}
