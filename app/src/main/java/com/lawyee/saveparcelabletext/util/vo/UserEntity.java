package com.lawyee.saveparcelabletext.util.vo;

import java.io.Serializable;

/**
 * All rights Reserved, Designed By www.lawyee.com
 *
 * @version V 1.0 xxxxxxxx
 * @Title: SaveParcelableText
 * @Package com.lawyee.saveparcelabletext.util.vo
 * @Description: $todo$
 * @author: YFL
 * @date: 2017/5/16 17:12
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2017 www.lawyee.com Inc. All rights reserved.
 * 注意：本内容仅限于北京法意科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */


public class UserEntity implements Serializable {
    private static final long serialVersionUID = -5683263669918171030L;
    private String userName;
    // 原始密码
    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    private String password;
}