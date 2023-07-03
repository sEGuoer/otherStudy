package newpackage;

import java.lang.reflect.Field;

public class Person {
    @Range(min=1, max=20)
    public String name;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Range(max=10)
    public String city;
    void check(Person person) throws IllegalArgumentException, ReflectiveOperationException {
        // 遍历所有Field:
        for (Field field : person.getClass().getFields()) {
            // 获取Field定义的@Range:
            Range range = field.getAnnotation(Range.class);
            // 如果@Range存在:
            if (range != null) {
                // 获取Field的值:
                Object value = field.get(person);
                // 如果值是String:
                if (value instanceof String s) {

                    String s1 = "";
                    // 判断值是否满足@Range的min/max:
                    if (s.length() < range.min() || s.length() > range.max()) {
                        System.out.println("长度不合法");
                    }else {
                        for (int i = 0; i < s.length(); i++) {
                            if (s.charAt(i) >= range.mathMin() && s.charAt(i) <= range.mathMax() || s.charAt(i) >= range.bigMin() && s.charAt(i) <= range.bigMax() || s.charAt(i) >= range.smallMin() && s.charAt(i) <= range.smallMax()) {
                                System.out.println("请不要输入非法字符");
                                s1 = "";
//                                throw new IllegalArgumentException("肥大字符");
                                break;
                            } else {
                                s1 = s;
                            }
                        }
                        if (s1.length() == s.length()) {
                            throw new IllegalArgumentException("Invalid field: " + field.getName());
                        }

                    }
                }
            }
        }
    }
}
