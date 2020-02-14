package com.my.test;

import com.my.util.CheckUtil;
import com.my.util.DateUtil;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 유틸을 테스트를 한다.
 *
 * @author jonghyeon
 */
public class UtilTest {
    /**
     * 체크유틸을 테스트 한다.
     */
    public static void checkUtil() {
        System.out.println(String.format("CheckUtil.isNullOrEmpty(\"\") --> %s", CheckUtil.isNullOrEmpty("")));
        System.out.println(String.format("CheckUtil.isNullOrEmpty(\"A\") --> %s", CheckUtil.isNullOrEmpty("A")));
        System.out.println();

        System.out.println(String.format("CheckUtil.isNotNullOrNotEmpty(\"\") --> %s", CheckUtil.isNotNullOrNotEmpty("")));
        System.out.println(String.format("CheckUtil.isNotNullOrNotEmpty(\"A\") --> %s", CheckUtil.isNotNullOrNotEmpty("A")));
        System.out.println();

        System.out.println(String.format("CheckUtil.nvl(\"\", \"DEFAULT\") --> %s", CheckUtil.nvl("", "DEFAULT")));
        System.out.println(String.format("CheckUtil.nvl(\"B\", \"DEFAULT\") --> %s", CheckUtil.nvl("B", "DEFAULT")));
        System.out.println();
    }

    /**
     * 데이트유틸을 테스트 한다.
     */
    public static void dateUtil() {
        System.out.println("날짜 -> 문자열");
        System.out.println(String.format("DateUtil.toYmdString(LocalDate.now()) --> %s", DateUtil.toYmdString(LocalDate.now())));
        System.out.println(String.format("DateUtil.toYmdString(LocalDate.now(), \"yyyyMMdd\") --> %s", DateUtil.toYmdString(LocalDate.now(), "yyyyMMdd")));

        System.out.println(String.format("DateUtil.toYmsString(LocalDateTime.now()) --> %s", DateUtil.toYmsString(LocalDateTime.now())));
        System.out.println(String.format("DateUtil.toYmsString(LocalDateTime.now(), \"yyyyMMddHHmmss\") --> %s", DateUtil.toYmsString(LocalDateTime.now(), "yyyyMMddHHmmss")));
        System.out.println();

        System.out.println("문자열 -> 날짜");
        System.out.println(String.format("DateUtil.toDateYmd(\"20200213\") --> %s", DateUtil.toDateYmd("20200213")));
        System.out.println(String.format("DateUtil.toDateYmd(\"20200213\") --> %s", DateUtil.toDateYmd("20200213")));
        System.out.println();

        System.out.println("날짜 == 날짜 ? true : false");
        System.out.println(String.format("DateUtil.equalsDateYmd(LocalDate.now(), LocalDate.now()) --> %s", DateUtil.equalsDateYmd(LocalDate.now(), LocalDate.now())));
        System.out.println();

        System.out.println("날짜1 < 날짜2 ? true : false");
        System.out.println(String.format("DateUtil.afterDateYmd(LocalDate.now(), LocalDate.now().plusDays(1)) --> %s", DateUtil.afterDateYmd(LocalDate.now(), LocalDate.now().plusDays(1))));
        System.out.println();

        System.out.println("날짜1 > 날짜2 ? true : false");
        System.out.println(String.format("DateUtil.afterDateYmd(LocalDate.now(), LocalDate.now().plusDays(1)) --> %s", DateUtil.beforeDateYmd(LocalDate.now(), LocalDate.now().plusDays(1))));
        System.out.println();

        System.out.println("날짜1 <= 날짜3 <= 날짜2 ? true : false");
        System.out.println(String.format("DateUtil.betweenDateYmd(LocalDate.now(), LocalDate.now().plusDays(2), LocalDate.now().plusDays(1)) --> %s", DateUtil.betweenDateYmd(LocalDate.now(), LocalDate.now().plusDays(2), LocalDate.now().plusDays(1))));
        System.out.println();
    }

}
