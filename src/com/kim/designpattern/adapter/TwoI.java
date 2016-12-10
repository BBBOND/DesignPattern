package com.kim.designpattern.adapter;

import java.util.Map;

/**
 * 被适配角色
 */
public interface TwoI {

    Map<String, Object> getBaseInfo();

    Map<String, Object> getOfficeInfo();

}
