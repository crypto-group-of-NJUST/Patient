package com.lilin.client.pojo_contr;

import com.lilin.client.utils.Pair;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * @author L
 * @date 2019-09-25 4:55
 * @desc 用于接收用户的查询条件
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryConditions {
    private Pair<BigInteger, BigInteger> timeInterval;
    private Pair<BigInteger, BigInteger> ageInterval;
    private String patientIdNumber;
    private String doctorIdNumber;
    private String doctorName;
    private String department;
}
