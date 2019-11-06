package com.mymybatisplus.vo;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@TableName("client_copy")
@Data
public class ClientCopy {

  private int clientid;
  private String clientcode;
  private String clientname;
  private String clientmac;
  private String clientip;
  private int state;


}
