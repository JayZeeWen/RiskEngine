package com.engine.model;

import java.math.BigDecimal;
import java.util.Date;

public class UcBasicInfo {
    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String userId;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 性别
     */
    private String gender;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 单位性质             1:政府机构、2:事业单位、3:国有/股份 、4:外资/合资、5:私营
     */
    private String companyType;

    /**
     * 户口类型
     */
    private String residence;

    /**
     * 婚姻状况
     */
    private String marryState;

    /**
     * 租金
     */
    private BigDecimal rent;

    /**
     * 所属行业
     */
    private String industry;

    /**
     * 户籍地址省份
     */
    private String resiProvince;

    /**
     * 有效房产证明
     */
    private String houseProve;

    /**
     * 核实收入
     */
    private BigDecimal verifySalary;

    /**
     * 实际收入
     */
    private BigDecimal realSalary;

    /**
     * QQ长度
     */
    private Integer qqLength;

    /**
     * 每月净利润额
     */
    private BigDecimal profitAmount;

    /**
     * 放贷城市
     */
    private String loanCity;

    /**
     * 现单位工作时长（月）
     */
    private Integer nowWorkMonth;

    /**
     * 第二联系人与客户关系( 4 兄弟姐妹  5 好友    )
     */
    private String secondRelation;

    /**
     * 房产类别             1:商业按揭房 2:公积金按揭房  3: 无按揭房 4: 自建房 5:亲属房             6: 单位房 7: 租赁
     */
    private String hourseType;

    /**
     * 微粒贷授信时长（月）
     */
    private Integer wechatLoanMonths;

    /**
     * 微粒贷额度
     */
    private BigDecimal wechatLoanAmount;

    /**
     * 微粒贷日利率   存百分号前的数字
     */
    private BigDecimal wechatLoanRate;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 
     * @return id 
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 
     * @return user_id 
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId 
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 姓名
     * @return user_name 姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 姓名
     * @param userName 姓名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 身份证号
     * @return id_card 身份证号
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 身份证号
     * @param idCard 身份证号
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    /**
     * 手机号
     * @return phone 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 性别
     * @return gender 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 性别
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * 年龄
     * @return age 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 年龄
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 单位性质             1:政府机构、2:事业单位、3:国有/股份 、4:外资/合资、5:私营
     * @return company_type 单位性质             1:政府机构、2:事业单位、3:国有/股份 、4:外资/合资、5:私营
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * 单位性质             1:政府机构、2:事业单位、3:国有/股份 、4:外资/合资、5:私营
     * @param companyType 单位性质             1:政府机构、2:事业单位、3:国有/股份 、4:外资/合资、5:私营
     */
    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    /**
     * 户口类型
     * @return residence 户口类型
     */
    public String getResidence() {
        return residence;
    }

    /**
     * 户口类型
     * @param residence 户口类型
     */
    public void setResidence(String residence) {
        this.residence = residence == null ? null : residence.trim();
    }

    /**
     * 婚姻状况
     * @return marry_state 婚姻状况
     */
    public String getMarryState() {
        return marryState;
    }

    /**
     * 婚姻状况
     * @param marryState 婚姻状况
     */
    public void setMarryState(String marryState) {
        this.marryState = marryState == null ? null : marryState.trim();
    }

    /**
     * 租金
     * @return rent 租金
     */
    public BigDecimal getRent() {
        return rent;
    }

    /**
     * 租金
     * @param rent 租金
     */
    public void setRent(BigDecimal rent) {
        this.rent = rent;
    }

    /**
     * 所属行业
     * @return industry 所属行业
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * 所属行业
     * @param industry 所属行业
     */
    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    /**
     * 户籍地址省份
     * @return resi_province 户籍地址省份
     */
    public String getResiProvince() {
        return resiProvince;
    }

    /**
     * 户籍地址省份
     * @param resiProvince 户籍地址省份
     */
    public void setResiProvince(String resiProvince) {
        this.resiProvince = resiProvince == null ? null : resiProvince.trim();
    }

    /**
     * 有效房产证明
     * @return house_prove 有效房产证明
     */
    public String getHouseProve() {
        return houseProve;
    }

    /**
     * 有效房产证明
     * @param houseProve 有效房产证明
     */
    public void setHouseProve(String houseProve) {
        this.houseProve = houseProve == null ? null : houseProve.trim();
    }

    /**
     * 核实收入
     * @return verify_salary 核实收入
     */
    public BigDecimal getVerifySalary() {
        return verifySalary;
    }

    /**
     * 核实收入
     * @param verifySalary 核实收入
     */
    public void setVerifySalary(BigDecimal verifySalary) {
        this.verifySalary = verifySalary;
    }

    /**
     * 实际收入
     * @return real_salary 实际收入
     */
    public BigDecimal getRealSalary() {
        return realSalary;
    }

    /**
     * 实际收入
     * @param realSalary 实际收入
     */
    public void setRealSalary(BigDecimal realSalary) {
        this.realSalary = realSalary;
    }

    /**
     * QQ长度
     * @return qq_length QQ长度
     */
    public Integer getQqLength() {
        return qqLength;
    }

    /**
     * QQ长度
     * @param qqLength QQ长度
     */
    public void setQqLength(Integer qqLength) {
        this.qqLength = qqLength;
    }

    /**
     * 每月净利润额
     * @return profit_amount 每月净利润额
     */
    public BigDecimal getProfitAmount() {
        return profitAmount;
    }

    /**
     * 每月净利润额
     * @param profitAmount 每月净利润额
     */
    public void setProfitAmount(BigDecimal profitAmount) {
        this.profitAmount = profitAmount;
    }

    /**
     * 放贷城市
     * @return loan_city 放贷城市
     */
    public String getLoanCity() {
        return loanCity;
    }

    /**
     * 放贷城市
     * @param loanCity 放贷城市
     */
    public void setLoanCity(String loanCity) {
        this.loanCity = loanCity == null ? null : loanCity.trim();
    }

    /**
     * 现单位工作时长（月）
     * @return now_work_month 现单位工作时长（月）
     */
    public Integer getNowWorkMonth() {
        return nowWorkMonth;
    }

    /**
     * 现单位工作时长（月）
     * @param nowWorkMonth 现单位工作时长（月）
     */
    public void setNowWorkMonth(Integer nowWorkMonth) {
        this.nowWorkMonth = nowWorkMonth;
    }

    /**
     * 第二联系人与客户关系( 4 兄弟姐妹  5 好友    )
     * @return second_relation 第二联系人与客户关系( 4 兄弟姐妹  5 好友    )
     */
    public String getSecondRelation() {
        return secondRelation;
    }

    /**
     * 第二联系人与客户关系( 4 兄弟姐妹  5 好友    )
     * @param secondRelation 第二联系人与客户关系( 4 兄弟姐妹  5 好友    )
     */
    public void setSecondRelation(String secondRelation) {
        this.secondRelation = secondRelation == null ? null : secondRelation.trim();
    }

    /**
     * 房产类别             1:商业按揭房 2:公积金按揭房  3: 无按揭房 4: 自建房 5:亲属房             6: 单位房 7: 租赁
     * @return hourse_type 房产类别             1:商业按揭房 2:公积金按揭房  3: 无按揭房 4: 自建房 5:亲属房             6: 单位房 7: 租赁
     */
    public String getHourseType() {
        return hourseType;
    }

    /**
     * 房产类别             1:商业按揭房 2:公积金按揭房  3: 无按揭房 4: 自建房 5:亲属房             6: 单位房 7: 租赁
     * @param hourseType 房产类别             1:商业按揭房 2:公积金按揭房  3: 无按揭房 4: 自建房 5:亲属房             6: 单位房 7: 租赁
     */
    public void setHourseType(String hourseType) {
        this.hourseType = hourseType == null ? null : hourseType.trim();
    }

    /**
     * 微粒贷授信时长（月）
     * @return wechat_loan_months 微粒贷授信时长（月）
     */
    public Integer getWechatLoanMonths() {
        return wechatLoanMonths;
    }

    /**
     * 微粒贷授信时长（月）
     * @param wechatLoanMonths 微粒贷授信时长（月）
     */
    public void setWechatLoanMonths(Integer wechatLoanMonths) {
        this.wechatLoanMonths = wechatLoanMonths;
    }

    /**
     * 微粒贷额度
     * @return wechat_loan_amount 微粒贷额度
     */
    public BigDecimal getWechatLoanAmount() {
        return wechatLoanAmount;
    }

    /**
     * 微粒贷额度
     * @param wechatLoanAmount 微粒贷额度
     */
    public void setWechatLoanAmount(BigDecimal wechatLoanAmount) {
        this.wechatLoanAmount = wechatLoanAmount;
    }

    /**
     * 微粒贷日利率   存百分号前的数字
     * @return wechat_loan_rate 微粒贷日利率   存百分号前的数字
     */
    public BigDecimal getWechatLoanRate() {
        return wechatLoanRate;
    }

    /**
     * 微粒贷日利率   存百分号前的数字
     * @param wechatLoanRate 微粒贷日利率   存百分号前的数字
     */
    public void setWechatLoanRate(BigDecimal wechatLoanRate) {
        this.wechatLoanRate = wechatLoanRate;
    }

    /**
     * 创建时间
     * @return create_date 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 创建时间
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 更新时间
     * @return update_date 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 更新时间
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}