package com.web.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by lj on 2017/12/14.
 */
public class User {
    private java.lang.Integer id;
    private java.lang.String openId;//微信openId
    private java.lang.String userAccount;//	用户账号
    private java.lang.String userPass;//   用户密码
    private java.lang.String depositPass;//	用户提现交易密码
    private java.lang.String userPic;//   用户头像
    private java.lang.String nickName;//   呢称
    private java.lang.String mobile;//   手机号
    private java.lang.String email;//   邮箱号
    private java.lang.String sex;//   性别：m男w女
    private java.lang.String birthday;//   生日
    private java.lang.String cardType;//   会员类型：wc普通会员pc会员用户yc年卡会员
    private java.lang.String cardName;
    private java.sql.Timestamp cardEffectiveTime;//   会员有效时间
    private java.sql.Timestamp cardInvalidTime;//   会员无效时间
    private java.lang.String myAgentId;//   我的代理商号
    private java.lang.String myAgentName;//   我的代理商名称
    private java.lang.String coach;//   教练认证
    private java.lang.String coachSpace;//   空间认证
    private java.lang.String agent;//   代理商认证
    private java.lang.String cooperate;//   合作认证
    private BigDecimal lockMoney;//   冻结金额
    private BigDecimal money;//   金额
    private String province; //省
    private String city;//市
    private String area;//区
    private String address;//街道
    private Timestamp lastLoginTime;//   最近登录时间
    private Timestamp createTime;//   创建时间

    private String createTimes;//   时间字符串
    private String confirmPassword;//新的密码
    private String smsCode;//验证码
    private String flag;//用户数据分类
    private String orderType; //订单类型
    private BigDecimal orderMoney;//订单金额
    private String orderNum;//订单数量
    private BigDecimal realMoney;//订单实际金额
    private Integer productId;
    private String productName;
    private BigDecimal productMoney;
    private String resourceSquarePic;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getDepositPass() {
        return depositPass;
    }

    public void setDepositPass(String depositPass) {
        this.depositPass = depositPass;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Timestamp getCardEffectiveTime() {
        return cardEffectiveTime;
    }

    public void setCardEffectiveTime(Timestamp cardEffectiveTime) {
        this.cardEffectiveTime = cardEffectiveTime;
    }

    public Timestamp getCardInvalidTime() {
        return cardInvalidTime;
    }

    public void setCardInvalidTime(Timestamp cardInvalidTime) {
        this.cardInvalidTime = cardInvalidTime;
    }

    public String getMyAgentId() {
        return myAgentId;
    }

    public void setMyAgentId(String myAgentId) {
        this.myAgentId = myAgentId;
    }

    public String getMyAgentName() {
        return myAgentName;
    }

    public void setMyAgentName(String myAgentName) {
        this.myAgentName = myAgentName;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getCoachSpace() {
        return coachSpace;
    }

    public void setCoachSpace(String coachSpace) {
        this.coachSpace = coachSpace;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getCooperate() {
        return cooperate;
    }

    public void setCooperate(String cooperate) {
        this.cooperate = cooperate;
    }

    public BigDecimal getLockMoney() {
        return lockMoney;
    }

    public void setLockMoney(BigDecimal lockMoney) {
        this.lockMoney = lockMoney;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getCreateTimes() {
        return createTimes;
    }

    public void setCreateTimes(String createTimes) {
        this.createTimes = createTimes;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public BigDecimal getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(BigDecimal realMoney) {
        this.realMoney = realMoney;
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

    public BigDecimal getProductMoney() {
        return productMoney;
    }

    public void setProductMoney(BigDecimal productMoney) {
        this.productMoney = productMoney;
    }

    public String getResourceSquarePic() {
        return resourceSquarePic;
    }

    public void setResourceSquarePic(String resourceSquarePic) {
        this.resourceSquarePic = resourceSquarePic;
    }
}