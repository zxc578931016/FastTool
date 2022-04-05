package com.fast.tool.poro;

import lombok.Data;


@Data
public class MapperUtil<T> {

    /**
     * code : 200
     * message :
     * data : {"actorCode":9,"actor":null,"actorMulti":{"address":"f028947","idAddress":"f028947","robustAddr":"f2nlvxccdlhydntnt5zchm6uhhpe6og6oy5dsloii","actorType":"Multiple Signature","balance":"4,066,699.5601 FIL","availableBalance":"1,662,457.994817694 FIL","initialBalance":"4,718,285.7142 FIL","lockingBalance":"2,404,241.565376167 FIL","unlockPeriod":"2020-10-15 22:44:00 to 2023-10-15 22:44:00","approvalThreshold":1,"msgCount":29,"tag":"","key_addr_signers":["f13qcdccijjbjuut23uu3lcg2apgrulgbenb2i7ia"],"createTime":"2020-10-08 03:19:00","lastTransactionTime":"2021-01-09 11:45:30","miners":null,"workerMiners":null},"actorMiner":null,"favorStatus":0,"favorAccount":0}
     */

    private int code;
    private String message;
    public T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
