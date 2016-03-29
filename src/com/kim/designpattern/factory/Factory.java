package com.kim.designpattern.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by kim on 16-3-27.
 */
public class Factory {

    public static Type create(Class c) {
        Type type = null;
        try {
            type = (Type) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return type;
    }

    /**
     * 随机生成
     *
     * @return
     */
    public static Type create() {
        Type type = null;
        List<Class> typeList = ClassUtils.getAllClassByInterface(Type.class);
        Random random = new Random();
        int rand = random.nextInt(typeList.size());
        type = create(typeList.get(rand));
        return type;
    }


    private static Map<String, Type> types = new HashMap<>();

    /**
     * 延时初始化(初始化后不释放)
     *
     * @param c
     * @return
     */
    public static Type lazyCreate(Class c) {
        Type type = null;
        try {
            if (types.containsKey(c.getSimpleName())) {
                type = types.get(c.getSimpleName());
            } else {
                type = (Type) Class.forName(c.getName()).newInstance();
                types.put(c.getSimpleName(), type);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return type;
    }
}
