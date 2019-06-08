package cn.itcast.utils;

import org.springframework.core.convert.converter.Converter;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: yyb
 * @Date: 2019/5/30 18:06
 * @Description:
 */
public class StringtoDateConverter implements Converter<String,Date> {
    @Override
    public Date convert(String source) {


        if (source==null||source.equals("")){
            throw  new RuntimeException("请传入格式正确的数据");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
           return simpleDateFormat.parse(source);

        } catch (ParseException e) {
            throw  new RuntimeException("格式转换错误");
        }

    }
}
