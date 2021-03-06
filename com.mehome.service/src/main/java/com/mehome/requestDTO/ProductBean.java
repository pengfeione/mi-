package com.mehome.requestDTO;

import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

import com.mehome.domain.ProductList;
import com.mehome.utils.LbsAmapUtils;
import com.mehome.utils.PageMysqlUtil;

/**
 * 产品
 *
 * @author xuyixun21
 */
public class ProductBean extends PageMysqlUtil {


    private Integer productId;

    private String productName;

    private Integer supplierId;

    private String supplierName;

    private Integer areaId;


    private Integer areaProvince;
    private Integer areaRegion;
    private Integer areaCity;
    private String areaName;

    private Boolean productActive;

    private Float productSort;
    /**
     * 是否有个人福利
     */
    private Boolean hasPersonal;

    private String personalWelfare;
    /**
     * 是否有企业福利
     */
    private Boolean isWelfare;

    private String productDetail;

    private String listpic;

    private List<String> detailpic;

    private String address;

    private String position;

    private String rules;

    private String netRulesUrl;
    /**
     * 房源数量
     */
    private Integer houseResourceNum;
    /**
     * 房源
     */
    private List<HouseBean> houseList;
    /**
     * 基础设施  包括公共交通  配套设施
     */
    private List<BasicBean> basicList;
    /**
     * 企业福利ID集合
     */
    private List<Integer> welfareList;
    /**
     * 点评集合
     */
    private List<CommentBean> commentList;

    private Float score;

    private Integer floor;

    private String shopping;//购物
    private String transport;//交通
    private String delicacy;//美食
    private String entertainment;//娱乐


    private Date startTime;

    private Date endTime;

    public String getShopping() {
        return shopping;
    }

    public void setShopping(String shopping) {
        this.shopping = shopping;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getDelicacy() {
        return delicacy;
    }

    public void setDelicacy(String delicacy) {
        this.delicacy = delicacy;
    }

    public String getEntertainment() {
        return entertainment;
    }

    public void setEntertainment(String entertainment) {
        this.entertainment = entertainment;
    }

    public Integer getAreaProvince() {
        return areaProvince;
    }

    public void setAreaProvince(Integer areaProvince) {
        this.areaProvince = areaProvince;
    }

    public Integer getAreaRegion() {
        return areaRegion;
    }

    public void setAreaRegion(Integer areaRegion) {
        this.areaRegion = areaRegion;
    }

    public Integer getAreaCity() {
        return areaCity;
    }

    public void setAreaCity(Integer areaCity) {
        this.areaCity = areaCity;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Boolean getProductActive() {
        return productActive;
    }

    public void setProductActive(Boolean productActive) {
        this.productActive = productActive;
    }

    public Float getProductSort() {
        return productSort;
    }

    public void setProductSort(Float productSort) {
        this.productSort = productSort;
    }

    public Boolean getHasPersonal() {
        return hasPersonal;
    }

    public void setHasPersonal(Boolean hasPersonal) {
        this.hasPersonal = hasPersonal;
    }

    public String getPersonalWelfare() {
        return personalWelfare;
    }

    public void setPersonalWelfare(String personalWelfare) {
        this.personalWelfare = personalWelfare;
    }

    public Boolean getIsWelfare() {
        return isWelfare;
    }

    public void setIsWelfare(Boolean isWelfare) {
        this.isWelfare = isWelfare;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public String getListpic() {
        return listpic;
    }

    public void setListpic(String listpic) {
        this.listpic = listpic;
    }

    public List<String> getDetailpic() {
        return detailpic;
    }

    public void setDetailpic(List<String> detailpic) {
        this.detailpic = detailpic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getNetRulesUrl() {
        return netRulesUrl;
    }

    public void setNetRulesUrl(String netRulesUrl) {
        this.netRulesUrl = netRulesUrl;
    }

    public Integer getHouseResourceNum() {
        return houseResourceNum;
    }

    public void setHouseResourceNum(Integer houseResourceNum) {
        this.houseResourceNum = houseResourceNum;
    }

    public List<HouseBean> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<HouseBean> houseList) {
        this.houseList = houseList;
    }

    public List<BasicBean> getBasicList() {
        return basicList;
    }

    public void setBasicList(List<BasicBean> basicList) {
        this.basicList = basicList;
    }

    public List<Integer> getWelfareList() {
        return welfareList;
    }

    public void setWelfareList(List<Integer> welfareList) {
        this.welfareList = welfareList;
    }

    public List<CommentBean> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<CommentBean> commentList) {
        this.commentList = commentList;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public ProductList beanToPojo(Boolean addBoolean) {
        ProductList product = new ProductList();
        Date date = new Date();
        product.setProductId(this.getProductId());
        product.setAddress(this.getAddress());
        product.setAreaId(this.getAreaId());
        product.setAreaProvince(this.getAreaProvince());
        product.setAreaRegion(this.getAreaRegion());
        product.setAreaCity(this.getAreaCity());
        product.setAreaName(this.getAreaName());
        product.setDetailpic(this.getDetailpic() == null && addBoolean ? null : JSONObject.toJSONString(this.getDetailpic()));
        product.setHasPersonal(this.getHasPersonal() == null && addBoolean ? Boolean.TRUE : this.getHasPersonal());
        if (this.getWelfareList() != null && this.getWelfareList().size() > 0) {
            product.setIsWelfare(Boolean.TRUE);
        } else if (addBoolean) {
            product.setIsWelfare(Boolean.FALSE);
        } else {
            product.setIsWelfare(this.getIsWelfare());
        }
        product.setListpic(this.getListpic());
        product.setNetRulesUrl(this.getNetRulesUrl());
        product.setPersonalWelfare(this.getPersonalWelfare());
        if (!StringUtils.isEmpty(this.getAddress())) {
            String position = LbsAmapUtils.formatPosition(this.getAddress());
            product.setPosition(position);
        }
        product.setProductActive(addBoolean ? Boolean.TRUE : this.getProductActive());
        product.setProductDetail(this.getProductDetail());
        product.setProductName(this.getProductName());
        product.setProductSort(this.getProductSort() == null && addBoolean ? 0 : this.getProductSort());
        product.setRules(this.getRules());
        product.setSupplierId(this.getSupplierId());
        product.setFloor(this.getFloor() == null && addBoolean ? 0 : this.getFloor());
        product.setScore(this.getScore() == null && addBoolean ? 5.0f : this.getScore());
        product.setCreateTime(addBoolean ? date : null);
        product.setUpdateTime(date);
        return product;
    }

    public ProductBean() {

    }

    public ProductBean(ProductList product, List<HouseBean> houseList, List<BasicBean> basicList, List<CommentBean> commentList, List<Integer> welfareList) {
        this.setAddress(product.getAddress());
        this.setAreaId(product.getAreaId());
        this.setAreaName(product.getAreaName());
        this.setAreaProvince(product.getAreaProvince());
        this.setAreaRegion(product.getAreaRegion());
        this.setAreaCity(product.getAreaCity());
        this.setBasicList(basicList);
        this.setCommentList(commentList);
        if (!StringUtils.isEmpty(product.getDetailpic()) && product.getDetailpic().length() > 2) {
            List<String> detailPicList = new ArrayList<String>();
            String detailPic = product.getDetailpic().substring(1, product.getDetailpic().length() - 1);
            String[] pics = detailPic.split(",");
            for (String string : pics) {
                detailPicList.add(string);
            }
            this.setDetailpic(detailPicList);
        }
        this.setHasPersonal(product.getHasPersonal());
        this.setHouseList(houseList);
        this.setIsWelfare(product.getIsWelfare());
        this.setListpic(product.getListpic());
        this.setNetRulesUrl(product.getNetRulesUrl());
        this.setPersonalWelfare(product.getPersonalWelfare());
        this.setPosition(product.getPosition());
        this.setProductActive(product.getProductActive());
        this.setProductDetail(product.getProductDetail());
        this.setProductName(product.getProductName());
        this.setProductSort(product.getProductSort());
        this.setRules(product.getRules());
        this.setSupplierId(product.getSupplierId());
        this.setWelfareList(welfareList);
        this.setTransport(product.getTransport());
        this.setDelicacy(product.getDelicacy());
        this.setShopping(product.getShopping());
        this.setEntertainment(product.getEntertainment());
        //
        this.setProductId(product.getProductId());
        this.setScore(product.getScore());
    }
}
